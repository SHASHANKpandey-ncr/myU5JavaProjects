package q2.A;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q2_A_example {

	public static void main(String[] args) {
		
		PrintWork[] works= {
				new PrintWork("Cooking"),
				new PrintWork("Bathing"),
				new PrintWork("Playing"),
				new PrintWork("Studing"),
				new PrintWork("Sleeping")
		};
		
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		// we can increase the number argument to complete the execution even quicker.  
		
		
		for(PrintWork work:works) {
			executorService.submit(work);
		}
		executorService.shutdown();
	}
	
	
	
}

class PrintWork implements Runnable{

	String name;
	public PrintWork(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
			
		System.out.println(name+" initiated by "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" done by "+Thread.currentThread().getName());
	}
	
}
