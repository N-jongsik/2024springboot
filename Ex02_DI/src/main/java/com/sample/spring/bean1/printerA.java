package com.sample.spring.bean1;

import org.springframework.stereotype.Component;

@Component("printerA")
public class printerA implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Printer A : " + message);

	}

}
