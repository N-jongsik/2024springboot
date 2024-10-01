package com.sample.spring.tv2;

public class LgTv implements TV{
	public LgTv() {
		System.out.println("===> LgTv");
	}
	
	@Override
	public void turnOn() {
		System.out.println("LgTv 전원 킴");
		
	}
	@Override
	public void turnOff() {
		System.out.println("LgTv 전원 끔");
		
	}
	@Override
	public void soundUp() {
		System.out.println("LgTv 소리 킴");
		
	}
	@Override
	public void soundDown() {
		System.out.println("LgTv 소리 끔");
		
	}
}
