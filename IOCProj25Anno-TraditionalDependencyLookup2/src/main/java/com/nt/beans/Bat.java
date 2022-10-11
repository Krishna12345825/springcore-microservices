package com.nt.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class Bat {
	
	public Bat() {
		System.out.println("Bat:: 0-param constructor");
	}
	
	public  int scoreRuns() {
		System.out.println("Bat::scoreRuns()");
		return  new Random().nextInt(130);
	}

}
