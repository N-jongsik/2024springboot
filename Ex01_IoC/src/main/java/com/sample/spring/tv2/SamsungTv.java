package com.sample.spring.tv2;

public class SamsungTv implements TV{
	public SamsungTv() {
		System.out.println("===> SamsungTv");
	}
	@Override
	public void turnOn() {
		System.out.println("SamsungTv 전원 킴");
	}
	@Override
	public void turnOff() {
		System.out.println("SamsungTv 전원 끔");
	}

	@Override
	public void soundUp() {
		System.out.println("SamsungTv 소리 킴");
	}
	@Override
	public void soundDown() {
		System.out.println("SamsungTv 소리 끔");
	}
}
