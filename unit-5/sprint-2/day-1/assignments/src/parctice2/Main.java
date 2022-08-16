package parctice2;

public class Main {
//	
	
	public static void main(String[] args) throws InterruptedException {
		MyThread1 myThread1=new MyThread1();
		Thread thread1=new Thread(myThread1);
		
		MyThread2 myThread2=new MyThread2();
		Thread thread2=new Thread(myThread2);
		
		
		thread2.start();
		thread2.join();
		thread1.start();
		thread1.join();
		
//		thread1.join();
		System.out.println("3rd : "+myThread1.ans);
	}
	
	
	

}



class MyThread1 implements Runnable{
	MyThread2 myThread2=new MyThread2();
	int ans=myThread2.target;
	@Override
	public void run() {
		
		
		for(var i=1;i<=10;i++) {ans=ans*i;}
		System.out.println(ans+" 2nd");
		

	}
	
}

class MyThread2 implements Runnable{
	
	int target=1;
	
	@Override
	public void run() {
		
		System.out.println("1st");
		
		

	}
	
}

// USING 3 THREADS one by one with the help of join




