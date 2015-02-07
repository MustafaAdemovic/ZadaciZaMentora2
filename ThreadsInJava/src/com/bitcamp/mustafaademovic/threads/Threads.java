package com.bitcamp.mustafaademovic.threads;

import java.io.IOException;

import com.bitcamp.mustafaademovic.utils.Crawling;

public class Threads extends Thread {

	private String fileName;
	private String url;

	public Threads(String fileName, String url) {
		this.fileName = fileName;
		this.url = url;
	}

	public void run() {
		Crawling crawler;

		try {
			crawler = new Crawling(fileName, url);
			crawler.counter++;
			System.out.println("Crawled " + crawler.counter + " time.");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}