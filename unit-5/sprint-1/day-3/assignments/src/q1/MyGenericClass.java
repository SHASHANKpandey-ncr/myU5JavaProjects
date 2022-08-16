package q1;

public class MyGenericClass<T> {
	
	T obj;
	
	void add (T obj) {this.obj=obj;} 
	
	T get() {return obj;} 
	
}

class Main{
	public static void main(String[] args) {
		
		
		MyGenericClass<String> generic1=new MyGenericClass<>();
		generic1.add("Hello Java"); // adding String
		System.out.println(generic1.get());
		
		MyGenericClass<Integer> generic2=new MyGenericClass<>();
		generic2.add(12); // adding Integer
		System.out.println(generic2.get());
		
		/*
		  MyGenericClass<Student> generic3=new MyGenericClass<>(); 
		  generic3.add(new Student(24,"Aman",985)); // adding Student Obj
		  System.out.println(generic3.get()); // add after making Student bean class
		 */
	}
}
// Create your own Generic Class and use a Demo class to implement it.

