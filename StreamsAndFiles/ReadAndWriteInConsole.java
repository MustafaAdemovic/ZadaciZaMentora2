package com.bitcamp.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadAndWriteInConsole {

	public static void main(String[] args) {
		InputStream is = new DataInputStream(System.in);
		OutputStream os = new DataOutputStream(System.out);
		byte[] buffer = new byte[20];
		try {
			while (is.read(buffer) >= 0) {
				os.write(buffer);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
