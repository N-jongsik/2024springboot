package com.sample.spring.bean;

public class Member {
	private String name;
	private String nickName;
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

	public void print() {
		printer.print(name);
	}
}
