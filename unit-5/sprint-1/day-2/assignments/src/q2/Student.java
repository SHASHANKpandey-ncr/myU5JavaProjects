package q2;

import java.util.Comparator;
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
		TreeMap<Student, String> tm=new TreeMap<>(new StudentMarksComp());
		tm.put(new Student(10,"sp", 99), "CG");
		tm.put(new Student(17,"as", 99), "MP");
		tm.put(new Student(32,"at", 89), "UP");
		tm.put(new Student(9,"np", 95), "CG");
		
		Set<Map.Entry<Student, String>> set=tm.entrySet();
		
		for(Map.Entry<Student, String> map:set) {
			
			System.out.println("Topper of "+map.getValue()+" is : ");
			System.out.println();
			
			Student student=map.getKey();
			System.out.println("Name : "+student.getName());
			System.out.println("Roll : "+student.getRoll());
			System.out.println("Marks : "+student.getMarks());
			System.out.println();
		}
		
	}
}

// using TreeeMap

// Sort this Map according to the student marks using TreeMap and 
// print the state name and the corresponding student details 
//in sorted order.


// making a Treemap by a bean class
// sort by marks(if marks same, sort by name)
// use of Comparator class
// making sorting Comparator logic


