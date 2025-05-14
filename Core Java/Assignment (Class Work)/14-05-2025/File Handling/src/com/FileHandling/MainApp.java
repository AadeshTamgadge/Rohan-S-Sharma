package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) {

		File myFile = new File("H:\\FIRSTBIT SOLUTION\\File Handling in Java\\mytxt.txt");
		System.out.println("File Found or Not found status : " + myFile.exists());
		
		try {
			System.out.println("File creation status : " + myFile.createNewFile());
			System.out.println("File Found or Not found status : " + myFile.exists());
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Unable to create file !");
		} finally {
			if (myFile.exists() == true) {
				myFile.delete();
				System.out.println("File deleted Successfully...");
			} else {
				System.out.println("This file not found...");
			}
		}
		System.out.println("File Found or Not found status : " + myFile.exists());
	}

}
