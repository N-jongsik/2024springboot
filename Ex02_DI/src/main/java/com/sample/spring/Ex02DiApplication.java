package com.sample.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex02DiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex02DiApplication.class, args);
//		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		// IoC 컨테이너 생성
//
//		Member member1 = (Member) context.getBean("member1");
//		member1.print();
//
//		Member member2 = context.getBean("hello", Member.class);
//		member2.print();
	}

}
