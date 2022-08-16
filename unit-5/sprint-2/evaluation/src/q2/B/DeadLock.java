package q2.B;

public class DeadLock {

	public static void main(String[] args) {
		Task1 task1=new Task1();
		Task1 task2=new Task1();
		
		Task2 task_a=new Task2();
		Task2 task_b=new Task2();
		
		Thread thread1=new Thread(
				()->{
					task1.funX();
					System.out.println("thread1");
					
					task_a.funY();
					System.out.println("thread1");
				}
				
				);
		
		Thread thread2=new Thread(
				()->{
					task2.funX();
					System.out.println("thread2");
					
					task_b.funY();
					System.out.println("thread1");
				}
				
				);
		
		
		thread1.start();
		thread2.start();
		
	}
	
	
}



class Task1{
	public synchronized void funX() {
		System.out.println("inside function x of : ");
	}
}

class Task2{
	public synchronized void funY() {
		System.out.println("inside function y of : ");
	}
}



/*
The deadLock is a condition where 2 or more threads compete for same resources and end up looping in a deadLock.

The above program shows the deadlock condition and 
we can overcome deadlock by removing synchronized keyword 
from any of the classes.
*/

