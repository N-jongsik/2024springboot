package com.sample.spring.bean1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {
	@Value("홍길동")
	private String name;
	@Value("도사")
	private String nickName;
	@Autowired
	@Qualifier("printerA")
	private Printer printer;

	public Member() {
	};

	public Member(String name, String nickName, Printer printer) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.printer = printer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public String print() {
		return "hello" + name + " : " + nickName;
	}
}
