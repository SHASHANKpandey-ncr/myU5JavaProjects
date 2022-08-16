package q1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
}


class Main{
	
	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(12, "one", 500));
		students.add(new Student(14, "two", 199));
		students.add(new Student(15, "three", 485));
		students.add(new Student(13, "four", 295));
		students.add(new Student(10, "five", 193));
		
		List<Student> studentsWithLessThan250MarksList=  
		students
		.stream()
		.filter(s->s.getMarks()<250)
		.collect(Collectors.toList()); 
		// .forEach(s->System.out.println(s)); for direct print
		
		System.out.println(studentsWithLessThan250MarksList);
		// unsorted filtered list
		
		TreeSet<Student> studentsWithLessThan250MarksSet=
				new TreeSet<>(new StudentRollComp());
		
		for(Student s:studentsWithLessThan250MarksList) {
			studentsWithLessThan250MarksSet.add(s);
		}
		
		System.out.println(studentsWithLessThan250MarksSet);
		// sorted filtered set
	}
	
}

class StudentRollComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRoll()>o2.getRoll())return 1;
		else if(o1.getRoll()<o2.getRoll())return -1;
		else return 0;
	}
	
}

// Filtering Students list less than 250Marks using Streams and filter
// JavaStreamCollect and ArrayList to TreeSet conversion
// TreeSet and Comparator for sorting
// sorting ac to roll

