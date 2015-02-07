package com.bitcamp.mustafaademovic.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class Crawling {

	private String file;
	private String url;
	private String path = System.getProperty("user.home") + File.separator
			+ "workspace" + File.separator + "ThreadsInJava" + File.separator
			+ "src" + File.separator + "crawled pages" + File.separator;
	public static int counter = 0;

	public Crawling(String file, String url) throws IOException {

		this.file = file;
		this.url = url;
		this.path += file;
		crawlingUrl();
	}

	private void crawlingUrl() throws IOException {

		FileOutputStream fos = null;
		InputStream in = null;
		PrintWriter out = null;

		try {
			URL address = new URL(this.url);
			URLConnection connection = address.openConnection();
			in = connection.getInputStream();
			fos = new FileOutputStream(this.path);
			URL currentUrl = connection.getURL();
			int bytes = 0;
			byte[] buffer = new byte[1024];
			while ((bytes = in.read(buffer)) >= 0) {
				fos.write(buffer, 0, bytes);

			}
			out = new PrintWriter(new FileOutputStream(this.path, true));
			out.print(currentUrl.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fos.close();
			in.close();
			out.close();
		}
	}

}