package q2Alternate;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
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
	private int roll;
	private String name;
	private int marks;
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
}

class StudentMarksComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getMarks()>s2.getMarks())return 1;
		else if(s1.getMarks()<s2.getMarks())return -1;
		else return s1.getName().compareTo(s2.getName());
		
	}
	
}

class Main{
	public static void main(String[] args) {
		TreeMap<String,Student> tm=new TreeMap<>();
		tm.put("CG", new Student(10,"sp", 100));
		tm.put("MP", new Student(17,"as", 99));
		tm.put("UP", new Student(32,"at", 89));
		tm.put("HP", new Student(9,"np", 95));
		
		Set<Map.Entry< String,Student>> set=tm.entrySet();
		
		List<Map.Entry< String,Student>>list=new ArrayList<>(set);
		
		Collections
		.sort(list,(a,b)->(a.getValue().getMarks()>b.getValue().getMarks()?1:-1));
		
		
		for(Map.Entry<String,Student> map:list) {
			
			System.out.println("Topper of "+map.getKey()+" is : ");
			System.out.println();
			
			Student student=map.getValue();
			System.out.println("Name : "+student.getName());
			System.out.println("Roll : "+student.getRoll());
			System.out.println("Marks : "+student.getMarks());
			System.out.println();
		}
		
	}
}

// using TreeeMap
// key - state;        value - Student bean class
// Sort this Map according to the student marks using Collections.sort and 
// print the state name and the corresponding student details 
//in sorted order using 		Collections.sort


// making a TreeMap by a bean class
// sort by marks(if marks same)



