package q2;

import java.security.Provider.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//******************************************************

public class PrintStatus implements Runnable{

	
	String name;
	public PrintStatus(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println(name +" started by "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name +" completed by "+Thread.currentThread().getName());

	}

}


//******************************************************


class Main{
	
	
	public static void main(String[] args) {
		
		PrintStatus[] tasks= {
				new PrintStatus("DSA"),
				new PrintStatus("Coding"),
				new PrintStatus("CSBT"),
				new PrintStatus("MAC")	
		};
		
		
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		for(PrintStatus task:tasks) {
			executorService.submit(task);
		}
		executorService.shutdown();
	}

}

//******************************************************


// ThreadPool Executer 
// threads imp Runnable
