package com.sample.spring.tv1;

public class TVUser {

	public static void main(String[] args) {
		LgTv lg = new LgTv();
		lg.powerOn();
		lg.powerOff();
		
		lg.volumnOn();
		lg.volumnOff();
		
		SamsungTv samsung = new SamsungTv();
		samsung.turnOn();
		samsung.turnOff();
		samsung.soundOn();
		samsung.soundOn();
		
		
	}

}
