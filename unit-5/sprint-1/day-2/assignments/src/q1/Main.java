package q1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<>();
		hm.put("CG", "Raipur");
		hm.put("MP", "Bhopal");
		hm.put("UP", "Lucknow");
		hm.put("HP", "Shimla");
		hm.put("JK", "Ranchi");
		
		System.out.println("Getting all the keys");
		Collection<String> keys = hm.keySet();
		for (String x : keys) {
			System.out.println(x);
		}
		
		System.out.println("=================");
		
		System.out.println("Getting all the values");
		Collection<String> values = hm.values();
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println("=================");
		
		System.out.println("Getting both key and values");
		Set<Entry<String, String>> keyValue = hm.entrySet();
		for (Map.Entry<String, String> me : keyValue) {
			System.out.println(me.getKey() + "==" + me.getValue());
		}
		
		System.out.println();
		
		
		
		// creating HashMap
		// creating Key-Value pair
		// Getting all the keys
		// Getting all the values
		// Getting both key and values
	}
}
