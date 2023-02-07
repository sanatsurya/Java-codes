package com.SpringPractice.Tutorial2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mediateck implements MobileProcessor {

	public void process() {
		System.out.println("This is the second best CPU");

	}

}
