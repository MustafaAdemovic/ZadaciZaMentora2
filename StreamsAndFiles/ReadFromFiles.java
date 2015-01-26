package com.bitcamp.streams;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFromFiles {

	public static void main(String[] args) throws IOException {
		File path = new File("File/Read");
		InputStream is = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String firstLine;
		while ((firstLine = br.readLine()) != null) {
			System.out.println(firstLine);
		}
		br.close();
	}

}
/* Poruka na konzoli: "Test citanje iz file-a!!!" */