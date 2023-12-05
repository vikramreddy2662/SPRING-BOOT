package com.myprojects.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appp {
	public static  void main(String[] args) {
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext(args, car.class);
             
		vehicle v=new car();
		v.drive();
		}}
