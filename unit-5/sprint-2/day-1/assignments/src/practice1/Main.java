package practice1;



public class Main {

	public static void main(String[] args) {
		
		MyThread myThread=new MyThread();
		Thread thread=new Thread(myThread);
		
		
		thread.start();
	}
	
	
}


class MyThread implements Runnable{

	@Override
	public void run() {
	
		for(var i=1;i<=10;i++) {
			if(i==6)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(i);
		}
		
	}
	
}


// class MyThread implements Runnable
/*
 * Create a thread which prints 1 to 10.After printing 5, there 
 * should be a delay of 5000 milliseconds before printing 6
 */