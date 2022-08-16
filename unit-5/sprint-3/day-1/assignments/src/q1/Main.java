package q1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//*******************************************

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student student=new Student(12, "SP", new Address("CG", "Raipur", "492001"), "sp@g.com", "ab12");
		
		File file=new File("student.txt");
		file.createNewFile();
		
		////Serialization
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student);
		objectOutputStream.close();
		System.out.println("Student object Serialized");
		System.out.println();
		
		////DeSerialization
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Student studentDeSerialized= (Student) objectInputStream.readObject();
		System.out.println("Student object DeSerialized");
		System.out.println();
		
		
		System.out.println("name: "+studentDeSerialized.getName());
		System.out.println("Roll: "+studentDeSerialized.getRoll());
		System.out.println(studentDeSerialized.getAddress());
		System.out.println("Email: "+studentDeSerialized.getEmail());
		System.out.println("Password: "+studentDeSerialized.getPassword());
	
	}
	
}

//*******************************************



class Address implements Serializable{
	
	private String state;
	private String city;
	private String pincode;
	
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address: [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}

//*******************************************


class Student implements Serializable{
	
	private int roll;
	private String name;
	private Address address;
	private String email;
	private transient String password;
	
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
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Student(int roll, String name, Address address, String email, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

}

//*******************************************