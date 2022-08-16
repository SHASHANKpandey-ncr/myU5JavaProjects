package q2;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface PrintList {
	
	abstract void display(List<String> city);
	
}


class Main {


	
	public static void main(String[] args) {
		List<String> list= new  ArrayList<>();
		list.add("Raipur");
		list.add("Jaipur");
		list.add("Nagpur");
		list.add("Jabalpur");
		
		PrintList i1=(List<String> city)->{
			for(String cities:city) {
				System.out.println(cities);
			}
		};
		
		i1.display(list);
	}

}

// @FunctionalInterface
// Lambda Expression ->