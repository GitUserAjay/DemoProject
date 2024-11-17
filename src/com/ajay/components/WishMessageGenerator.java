package com.ajay.components;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	private LocalDateTime ldt;
	public void generate(String name) {
		ldt=LocalDateTime.now();
		int hours=ldt.getHour();
		if(hours<12)
			System.out.println("good morning "+ name);
		else if(hours<16)
			System.out.println("good Afternoon "+ name);
		else if (hours<20)
			System.out.println(" good evening "+ name);
		else
			System.out.println("good night "+name);
	}

}
