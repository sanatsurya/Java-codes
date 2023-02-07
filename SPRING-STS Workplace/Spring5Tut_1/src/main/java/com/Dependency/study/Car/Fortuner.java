package com.Dependency.study.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Dependency.studyInterfaces.CarI;
import com.Dependency.studyInterfaces.Engine;
public class Fortuner implements CarI {
	@Autowired
	@Qualifier("V6engine")
	Engine engine;
	@Override
	public String company() {
		// TODO Auto-generated method stub
		return "This is a Toyota Company Car and the engine configuration type is"+engine.type();
	}

}
