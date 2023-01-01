package com.SpringPractice.Tutorial;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void status() {
		// TODO Auto-generated method stub
		System.out.println("vehicle is stopped");
	}

}
