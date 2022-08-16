package q3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//************************************************************

public class Main {

	public static void main(String[] args) throws IOException {
		
		
	
		System.out.println();
		System.out.println("Enter the file name/path : ");
		Scanner sc=new Scanner(System.in);
		String file=sc.nextLine();
		
		FileReader fileReader=new FileReader(file);
		int index=fileReader.read();
		
		System.out.println();
		System.out.println("Enter the character to be counted : ");

		char character=sc.nextLine().charAt(0);
		
		sc.close();
		
		int count=0;
		while(index!=-1) {
			if(Character.toLowerCase((char)index)==Character.toLowerCase(character))count++;
			index=fileReader.read();
		}
		
		System.out.println();
		System.out.println("The File has "+count+" instances of letter " +character+".");
		
	}

}

//************************************************************

// Write a program to count the number of times a character appears in the File. 
//(Case insensitive... 'a'and 'A' are considered to be the same)


// using FileReader
// Character object and Character input taking and converting it toLowerCase
