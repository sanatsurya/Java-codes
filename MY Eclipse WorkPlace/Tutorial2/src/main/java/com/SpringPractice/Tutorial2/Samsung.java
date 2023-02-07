package com.SpringPractice.Tutorial2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
//	@Qualifier("mediateck")--Insted of primary this can also used
	MobileProcessor cpu;
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	public void config() {
		System.out.println("This is a samsung smart device");
		cpu.process();
	}
}
