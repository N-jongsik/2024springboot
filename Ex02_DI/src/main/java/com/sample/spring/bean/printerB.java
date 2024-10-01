package com.sample.spring.bean;

public class printerB implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Printer B : " + message);

	}

}
