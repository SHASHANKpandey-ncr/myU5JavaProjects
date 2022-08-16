package youProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
  You Problem:
Convert a list of String into a list of Integer(length of that string) and then filter all even numbers inside
another List.

*/

public class Main {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<>();
		strList.add("sp");
		strList.add("swabhi");
		strList.add("shashank");
		strList.add("pandey");
		strList.add("shashank_pandey");
		
		List<Integer> intList=
				strList
				.stream()
				.map(str->str.length())
				.collect(Collectors.toList());
				
		intList
		.stream()
		.filter(i->i%2==0)
		.forEach(i->System.out.println(i));
	}
	
	
}


/*
  Convert a list of String into a list of Integer(length of that string) and
  then filter all even numbers inside another List.
  
  stream,map,collect,filter,forEach
 */

