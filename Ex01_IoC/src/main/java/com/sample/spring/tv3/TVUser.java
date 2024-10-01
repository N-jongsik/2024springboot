package com.sample.spring.tv3;

public class TVUser {

	public static void main(String[] args) {
		// TV tv = new LgTv();

		BeanContainer container = new BeanContainer();
		TV tv = (TV) container.getBean(args[0]);

		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();

	}

}
