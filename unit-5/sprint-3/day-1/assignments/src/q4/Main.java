package q4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// *******************************************

public class Main {
		
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee=new Employee(1, "sp", new Address("CG", "Raipur", 492001), "sp@gmail.com", "de4f65df");
				
		File file=new File("emp.txt");
		file.createNewFile();
		
		////serialization
		// also, can give path name directly 
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		System.out.println("Employee object Serialized");
		System.out.println();
		
		
		////deserialization
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Employee employeeDeserialized=(Employee) objectInputStream.readObject();
		System.out.println("Employee object DeSerialized");
		System.out.println();
		
		
		System.out.println("name: "+employeeDeserialized.getEmpName());
		System.out.println("ID: "+employeeDeserialized.getEmpId());
		System.out.println(employeeDeserialized.getAddress());
		System.out.println("Email: "+employeeDeserialized.getEmail());
		System.out.println("Password: "+employeeDeserialized.getPassword());
	
	}
	
}

//*******************************************


class Address implements Serializable{
	
	private String state;
	private String city;
	private int Pincode;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address: [state=" + state + ", city=" + city + ", Pincode=" + Pincode + "]";
	}

}

//*******************************************


class Employee implements Serializable{
	
	private int empId;
	private String empName;
	private Address address; // has a relationship
	private String email;
	private transient String Password;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Employee(int empId, String empName, Address address, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.email = email;
		Password = password;
	}
	
}

//*******************************************


// Serializable use
// creating a new file in same location
// Serializing the Employee object inside a file
// DeSerializing the Employee object from the file and printing details
// Bean Employee and bean Address class 
// Employee has Addreaa object(Has a relation ship)
