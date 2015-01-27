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
		String connectToWrite = "";

		try {
			while ((connectToWrite = scanner.nextLine()) != null) {
				os.write(connectToWrite.getBytes());
				os.write("\n".getBytes());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			os.close();
			scanner.close();
		}
		System.out.println("Završio si sa upisivanjem pogledaj file ");

	}

}
