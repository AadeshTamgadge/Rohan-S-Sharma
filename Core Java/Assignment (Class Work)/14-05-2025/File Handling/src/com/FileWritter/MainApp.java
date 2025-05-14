package com.FileWritter;

import java.io.FileWriter;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) {
		
		try {
			FileWriter file = new FileWriter ("H:\\FIRSTBIT SOLUTION\\File Handling in Java\\mytxt.txt");
			file.write("Welcome to java world...");
			file.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
