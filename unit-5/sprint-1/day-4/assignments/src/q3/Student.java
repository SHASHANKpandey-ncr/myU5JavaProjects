package q3;

import java.util.ArrayList;
import java.util.List;
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
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]"+"\n";
	}
	
	
	
	
}



class Employee {

	private int empId;
	private String empName;
	private int salary;
	
	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]"+"\n";
	}
	
	
}

// Student(roll,name,marks) and Employee(empId,empName,salary) bean class with toString


class Main{
	
	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(1, "one", 99));
		students.add(new Student(2, "two", 92));
		students.add(new Student(3, "three", 96));
		students.add(new Student(4, "four", 89));
		students.add(new Student(5, "five", 52));
		
		
		List<Employee> employees=
				students
				.stream()
				.map(item->new Employee(item.getRoll(), item.getName(),item.getMarks()*1000))
				.collect(Collectors.toList());
		
		System.out.println(students);
		System.out.println(employees);
		
	}

}

// .map use of Java streams
// With the help of stream, map each Student object to the Employee object
// marks*1000 should become the salary of the Employee
// use of .collect to make a new list

