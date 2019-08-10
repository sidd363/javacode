package com.sidd.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BadmintonAppWthAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appconfig.xml");
		
		Coach co = ctx.getBean("badmintonPlayer", Coach.class);
		
		co.getDailyRoutine();
		System.out.println(co.getFortune());
		
		ctx.close();
		
		

	}

}
