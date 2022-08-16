package q3;

public class Main {

	public static void main(String[] args) {
	
		System.out.println();
		
		ThreadToPrintOddNumbers oddNumbers=new ThreadToPrintOddNumbers();
		Thread thread=new Thread(oddNumbers);
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		System.out.println("Main thread");
		System.out.println("Odd numbers upto 20 : ");
		for(var i=1;i<=20;i++) {
			if(i%2==1)System.out.println(i);
		}
	
	}
}


class ThreadToPrintOddNumbers implements Runnable{

	@Override
	public void run() {
		System.out.println("Printing 1st coz of thread.join()");
		System.out.println("Even numbers upto 20 : (madeThread) ");
		for(var i=1;i<=20;i++) {
			if(i%2==0)System.out.println(i);
			
		}
		
	}
	
}


// use of thread.join()
// making thread by imp runnable

// main thread will exe later because its statement is after
// thread.join()

// main thread will join after exe of made-thread
