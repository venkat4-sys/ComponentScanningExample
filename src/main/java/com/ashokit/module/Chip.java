package com.ashokit.module;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		System.out.println("Chip::constructor");
	}
	
	public String chipType() {
		
		return "32-chip";
	}
	
	
	

}
