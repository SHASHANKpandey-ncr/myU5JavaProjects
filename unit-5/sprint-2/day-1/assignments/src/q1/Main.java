package q1;

public class Main {
		
	
	public static void main(String[] args) {
		
		Product p=new Product();
		
		Thread calculateProduct= new Thread(
				
				()->{
					int ans=1;
					for(int i=1;i<=10;i++) {
						ans=ans*i;
						p.setProduct(ans);
					}
				}
				
				);
		
		
		Thread printProduct= new Thread(
				
				()->{ 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// adding delay to ensure print after calc.
						e.printStackTrace();
					}
					System.out.println("Ans : "+p.getProduct());
					
				}
				);
		
		calculateProduct.start();
		printProduct.start();
	}

}

class Product{
	private int product;

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}
	
}

/*
 * Make a thread that will calculate a product of 1 to 10 
 * and another thread(main thread ) will print the 
 * calculated value of the first thread.
 */
