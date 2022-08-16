package we29JulyStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// 

public class StreamCollectStudents {

	public static void main(String[] args) {
		List<Student> studentList= Arrays.asList(
					new Student(1, "one", 900),
					new Student(2, "two", 850),
					new Student(3, "three", 600),
					new Student(4, "four", 700)
				);
		
		studentList
					.stream()
					.filter(student ->student.marks>800 )
					.forEach(student -> System.out.println(student.name));
		
		List<Student> studentListWithMarksMoreThan800= studentList
		.stream()
		.filter(student ->student.marks>800 )
		.collect(Collectors.toList());
		
		System.out.println(studentListWithMarksMoreThan800);
		
	}
	
}


class Student{
	Integer roll;
	String name;
	Integer marks;
	
	public Student(Integer roll, String name, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
