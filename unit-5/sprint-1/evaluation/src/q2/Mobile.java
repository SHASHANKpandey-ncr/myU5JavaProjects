package q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Mobile {

	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	
	public String addMobile(String company, String model) {
		
		ArrayList<String> mobileModle=new ArrayList<>();
		mobileModle.add(model);
		
		mobiles.put(company, mobileModle);
		
		return "Mobile added successfully";
		
	}
	
	
	
	public List<String> getModels(String company)throws InvalidMobileException{
		
//		System.out.println(mobiles.get(company));
		if(mobiles.containsKey(company)) {
			System.out.println(mobiles.get(company));
			return mobiles.get(company);
			
		}
		else {
			InvalidMobileException ime=new InvalidMobileException("Enter correct details !!");
			throw ime;
		}
		
	}
	
	
}




class InvalidMobileException extends Exception {
	 
	public InvalidMobileException(String message) {
		super(message);
	}

}


class Main{
	
	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		m.addMobile("Apple", "i10");
		m.addMobile("Apple", "i11");
		m.addMobile("Apple", "i12");
		m.addMobile("Apple", "i13");
		m.addMobile("Apple", "i13");
		m.addMobile("Nokia", "X6");
		
		try {
			m.getModels("Apple");
		} catch (InvalidMobileException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	
	
}
