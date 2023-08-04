package com.ashokit.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	private Chip chip;
	
	public Robot() {
		System.out.println("constructor::Robot");
	}
	
	public void status() {
		String chipType = chip.chipType();
		System.out.println(chipType +"injected...");
		System.out.println("robot is running...");
		
	}

}
