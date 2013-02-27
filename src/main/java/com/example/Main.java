package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		System.out.println(applicationContext.getClass());
		System.out.println("Hello World!");
	}
	
}
