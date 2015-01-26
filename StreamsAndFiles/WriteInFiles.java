package com.bitcamp.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteInFiles {

	public static void main(String[] args) throws IOException {
		File path = new File("File/Write");
		OutputStream os = new FileOutputStream(path);
		String connectToWrite = "Upis u file!!";
		try {
			os.write(connectToWrite.getBytes());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			os.close();
		}
	}

}
/* Poruka na konzoli: "Upis u file!!" */