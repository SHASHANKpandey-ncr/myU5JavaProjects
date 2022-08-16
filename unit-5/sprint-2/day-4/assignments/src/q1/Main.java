package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//******************************************************


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Hp\\Desktop\\Shashank_fw18_0105\\unit-5\\sprint-2\\day-4\\assignments\\.dummy");
		
		System.out.println(file.exists());
		
		// or directly give "pathName" in place of file
		FileReader fileReader =new FileReader(file);
		
		int index=fileReader.read();
		
		String str="";
		
		while(index!=-1) {
			System.out.println((char) index);
			str=str+(char) index;
			index=fileReader.read();
		}
		System.out.println(str);
	}
	
}


//******************************************************


// checking a file exixts or not 
// using FileReader to read and get the content of a file 