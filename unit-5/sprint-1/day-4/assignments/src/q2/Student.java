package q2;

import java.util.Arrays;
import java.util.List;

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
		List<Student> students=Arrays.asList(
				new Student(1, "one", 900),
				new Student(2, "two", 690),
				new Student(3, "three", 790),
				new Student(4, "four", 990),
				new Student(5, "five", 890)
				);
		
		students
		.stream()
		.filter(s->s.getMarks()>800)
		.forEach(s->System.out.println(s));
		
	}
}

