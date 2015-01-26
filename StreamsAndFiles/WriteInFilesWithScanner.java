package com.bitcamp.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteInFilesWithScanner {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		File path = new File("File/Scanner");
		OutputStream os = new FileOutputStream(path);
		System.out.println("Write some text in file: ");
		String connectToWrite = scanner.nextLine();
		try {
			os.write(connectToWrite.getBytes());
	
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			os.close();
		}
		scanner.close();
	}

}
/*Rezultati s konzole: "Test upisa sa scannerom" */