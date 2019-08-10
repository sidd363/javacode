package com.sidd.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadmintonPlayer implements Coach {

	
	private FortuneService fs;
	@Autowired
	public BadmintonPlayer(FortuneService fs){
		this.fs = fs;
	}
	
	@Override
	public void getDailyRoutine() {
		// TODO Auto-generated method stub
		System.out.println("please play badminton with full efforts");

	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
		
	}

}
