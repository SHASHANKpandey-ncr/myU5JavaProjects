package q2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

// *********************************************

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	private String student_email;
	private transient String studentPassword;
	
	public Student(int studentId, String studentName, String studentAddress, String student_email,
			String studentPassword) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.student_email = student_email;
		this.studentPassword = studentPassword;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", student_email=" + student_email + "]";
	}
	
	
}

//*********************************************


class StudentDB{
	public static Set<Student> set=new HashSet<>();
	public static Set<Student> addStudent(Student student){
		
		set.add(student);
		return set;
	}
	
	
}

//*********************************************


class Main{
	
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			StudentDB db=new StudentDB();
			
			Student student1=new Student(1, "Ram", "Delhi", "ram@masai.com", "ram12");
			Student student2=new Student(2, "Sam", "Mumbai", "sam@masai.com", "sam6546");
			Student student3=new Student(3, "Jhon", "Pune", "jhon@masai.com", "jhon654");
			Student student4=new Student(4, "David", "Banglore", "david@masai.com", "david65465");
			Student student5=new Student(5, "Mark", "Kerla", "mark@masai.com", "mark654");
			
			
			StudentDB.addStudent(student1);
			StudentDB.addStudent(student2);
			StudentDB.addStudent(student3);
			StudentDB.addStudent(student4);
			StudentDB.addStudent(student5);
			

			
			File file=new File("dataBase.txt");
			file.createNewFile();
			
			//Serialization
			FileOutputStream fileOutputStream= new FileOutputStream(file);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject((Object)StudentDB.set);
			objectOutputStream.close();
			System.out.println("Serialization done !!");
			System.out.println();
			
			//DeSerialization
			FileInputStream fileInputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			Object deSerialized= objectInputStream.readObject();
			deSerialized=StudentDB.set;
			System.out.println("DeSerialization done !!");
			System.out.println();
			
			for(Student s:(Set<Student>)deSerialized) {
				System.out.println(s);
			}
		}
		

	
}

//*********************************************

