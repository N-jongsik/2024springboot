package com.sample.spring.tv3;

public class SonyTv implements TV {
	public SonyTv() {
		System.out.println("===> sonyTv");
	}

	@Override
	public void turnOn() {
		System.out.println("sonyTv 전원 킴");
	}

	@Override
	public void turnOff() {
		System.out.println("sonyTv 전원 끔");
	}

	@Override
	public void soundUp() {
		System.out.println("sonyTv 소리 킴");
	}

	@Override
	public void soundDown() {
		System.out.println("sonyTv 소리 끔");
	}
}
