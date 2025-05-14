package com.mystream.in;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		FileOutputStream fout = null;
		
		try {
			String data = "Hello java want to store in file";
			fout = new FileOutputStream("data.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			DataOutputStream dout = new DataOutputStream(bout);
			dout.writeUTF(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dout.close();
			bout.close();
			fout.close();
		}
	}

}
