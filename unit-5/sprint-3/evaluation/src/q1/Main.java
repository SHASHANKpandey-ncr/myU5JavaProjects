package q1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		File file=new File("student.txt");
		file.createNewFile();
		
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("Ram");
		fileWriter.write("\n");
		fileWriter.write("68");
		fileWriter.write("\n");
		fileWriter.write("74");
		fileWriter.write("\n");
		fileWriter.write("59");
		fileWriter.write("\n");
		fileWriter.write("88");
		fileWriter.write("\n");
		fileWriter.write("65");	
		fileWriter.write("\n");
		fileWriter.write("SAM");
		fileWriter.write("\n");
		fileWriter.write("86");
		fileWriter.write("\n");
		fileWriter.write("46");
		fileWriter.write("\n");
		fileWriter.write("23");
		fileWriter.write("\n");
		fileWriter.write("15");
		fileWriter.write("\n");
		fileWriter.write("96");
	
		
		fileWriter.flush();
		fileWriter.close();
		
		FileReader fileReader=new FileReader(file);
		String str="";
		int index=fileReader.read();
		while(index!=-1) {
			str=str+(char) index;
			index=fileReader.read();
		}
		System.out.println(str);
		
		
		File file1=new File("reportCard.txt");
		file1.createNewFile();
		FileWriter fileWriter1=new FileWriter(file1);
		
		fileWriter1.write("Ram total marks = "+(68+74+59+88+65)+" and average = "+((68+74+59+88+65)/5));
		fileWriter1.write("\n");
		fileWriter1.write("sam total marks = "+(86+46+23+15+96)+" and average = "+((86+46+23+15+96)/5));

		fileWriter1.flush();
		fileWriter1.close();
		System.out.println();
		System.out.println("Updated !! ");
		System.out.println("Kindly check the files !!");
	}

	
}
