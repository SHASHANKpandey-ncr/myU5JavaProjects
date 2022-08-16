package q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Student {

	private int RollNo;
	private int marks;
	private String Name;
	
	
	
	

	public Student(int rollNo, int marks, String name) {
		super();
		RollNo = rollNo;
		this.marks = marks;
		Name = name;
	}
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", marks=" + marks + ", Name=" + Name + "]"+"\n";
	}
	
	
}

class Main{
	
	public static void main(String[] args) {
		List<Student> students =new ArrayList<>();
		students.add(new Student(12, 495, "name1"));
		students.add(new Student(13, 230, "name2"));
		students.add(new Student(10, 210, "name5"));
		students.add(new Student(6, 400, "name3"));
		students.add(new Student(2, 352, "name4"));
		
		
		List<Student> studentsWithLessThan250marksList=
				students
				.stream()
				.filter(s->s.getMarks()<250)
				.collect(Collectors.toList());
		
		
		TreeSet<Student> studentsWithLessThan250marksSet=
				new TreeSet<>(new StudentRollComp());
		
		for(Student s:studentsWithLessThan250marksList) {
			studentsWithLessThan250marksSet.add(s);
		}
		
//		System.out.println(studentsWithLessThan250marksSet);
		
		for(Student s:studentsWithLessThan250marksSet) {
			System.out.println(s);
		}
	}
	
}



class StudentRollComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRollNo()>o2.getRollNo())return 1;
		else if(o1.getRollNo()<o2.getRollNo())return -1;
		else return 0;
	}
	
}
