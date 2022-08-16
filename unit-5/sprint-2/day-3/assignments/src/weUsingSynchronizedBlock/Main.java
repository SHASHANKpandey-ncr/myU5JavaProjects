package weUsingSynchronizedBlock;

//*******************************************

public class Main {

	public static void main(String[] args) {
		Common c=new Common();
		ThreadA t1=new ThreadA(c, "Ram");
		ThreadB t2=new ThreadB(c, "Shyam");
		
		t1.start();
		t2.start();
	}
	
}

//*******************************************


class Common{

	public void fun1(String name) { 
// synchronized (this) block -> object/block level lock
// synchronized (Common.class) block -> class level lock		
		synchronized (this) { // object/block level lock
			System.out.println("Welcome");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}
	
}

//*******************************************


class ThreadA extends Thread{
	
	Common c; // has a relationShip
	String name;
	
	public ThreadA(Common c,String name) {
		this.c=c;
		this.name=name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}	
}

//*******************************************


class ThreadB extends Thread{
	
	Common c; // has a relationShip
	String name;
	
	public ThreadB(Common c,String name) {
		this.c=c;
		this.name=name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}	
}

//*******************************************


// only synchronized(this){} block in method will provide 
//block/method level lock and will work properly if worked on 
//same object ie;for Common c=new Common(); -> only and will not
//work for diffrent objects of same class ie; for
//Common c1=new Common(); 
//Common c2=new Common();


// for working on different objects of a class we need class 
//level lock by providing synchronized (Common.class){} block
//in  method

// synchronized block is recommended over synchronized keyword

