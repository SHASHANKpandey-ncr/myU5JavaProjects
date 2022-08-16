package q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the file name/path : ");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		sc.close();
		
		FileReader fileReader=new FileReader(string);
		int index=fileReader.read();
		
		var str="";
		
		while(index!=-1) {
			str=str+Character.toUpperCase((char)index);
			index=fileReader.read();
		}
		
		File file=new File("newfile.txt");
		file.createNewFile();
		
		FileWriter fileWriter=new FileWriter(file);
		
		fileWriter.write(str);
		fileWriter.flush();
		fileWriter.close();
		
		System.out.println("Done. Check the file newfile.txt");
	}
	
}
