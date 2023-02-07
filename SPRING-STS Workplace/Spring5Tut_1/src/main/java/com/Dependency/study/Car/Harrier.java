package com.Dependency.study.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.Dependency.studyInterfaces.CarI;
import com.Dependency.studyInterfaces.Engine;

public class Harrier implements CarI {
	@Autowired
	@Qualifier("V8engine")
	public Engine engine;
	
//	//@Autowired
//	public Harrier(Engine engine) {
//		super();
//		engine.type="new v8 electro";
//		this.engine = engine;
//	}

@Override
public String company() {
	return "A tata Company Car"+engine.type();
}

}
