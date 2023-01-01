package com.SpringPractice.Tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public void status() {
		System.out.println("Car is running");
	}
	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}
	
}
