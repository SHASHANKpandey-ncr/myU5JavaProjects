package q4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//*******************************************************

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input file name/path : ");
		String inputStr=sc.nextLine();
		FileReader inputFile=new FileReader(inputStr);
		int index=inputFile.read();
		
		System.out.println("Enter the output file name/path : ");
		String outputStr=sc.nextLine();
		FileWriter outputFile=new FileWriter(outputStr);
		
		

		String str="";
		while(index!=-1) {
			str=str+(char) index;
			index=inputFile.read();
		}

//		System.out.println(str);
		
		outputFile.write(str);
		outputFile.flush();
		outputFile.close();
		
		System.out.println();
		System.out.println("copy-paste done, check your files !! ");
		
	}
	
}

//*******************************************************


// Write a program to copy from one file to another.
// using FileReader & FileWriter
// getting content of file in a string. 
// enter complete path name on input
