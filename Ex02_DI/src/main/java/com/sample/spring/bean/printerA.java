package com.sample.spring.bean;

public class printerA implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Printer A : " + message);

	}

}
