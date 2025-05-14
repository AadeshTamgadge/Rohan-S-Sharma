package com.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) throws IOException {
		FileReader f= null;
		try {
			 f = new FileReader("H:\\FIRSTBIT SOLUTION\\File Handling in Java\\mytxt.txt");
			char ch;
			int var;
			var = f.read();
			ch = (char) var;
			
//			do {
//				System.out.printf("%c", ch);
//				var = f.read();
//				ch = (char) var;
//			} while (var != -1);
//			f.close();
		
			  while( ( (ch = (char) f.read() ) != -1)) { 
				  System.out.printf("%c",ch);
			  }
			   
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			 f.close();
		}
	}

}
