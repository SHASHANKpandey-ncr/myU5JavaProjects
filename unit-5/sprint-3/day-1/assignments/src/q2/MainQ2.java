package q2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainQ2 {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee employee1=new Employee(null, null, null, null, 0);
		employee1.setName("SP");
		employee1.setDob("12/02/1996");
		employee1.setDepartment("technology");
		employee1.setDesignation("SDE11");
		employee1.setSalary(2100000);
		
		Employee employee2=new Employee(null, null, null, null, 0);
		employee2.setName("NP");
		employee2.setDob("15/12/1990");
		employee2.setDepartment("technology");
		employee2.setDesignation("DA11");
		employee2.setSalary(2000000);
		
		
		File file=new File("OutObject.txt");
		file.createNewFile();
		
		////Serialization
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee1);
		objectOutputStream.close();
		System.out.println("Employee object Serialized");
		System.out.println();
		
		
		////DeSerialization
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Employee employee1DeSerialized= (Employee) objectInputStream.readObject();
		System.out.println("Employee object DeSerialized");
		System.out.println();
		
		System.out.println("name: "+employee1DeSerialized.getName());
		System.out.println("DOB: "+employee1DeSerialized.getDob());
		System.out.println("Department: "+employee1DeSerialized.getDepartment());
		System.out.println("Designation: "+employee1DeSerialized.getDesignation());
		System.out.println("Salry: "+employee1DeSerialized.getSalary());
		
	}
	
}


class Employee implements Serializable{
	
	private String name;
	private String dob;
	private String department;
	private String designation;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(String name, String dob, String department, String designation, int salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	
}