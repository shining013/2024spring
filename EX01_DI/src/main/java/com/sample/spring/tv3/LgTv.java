package com.sample.spring.tv3;

public class LgTv implements Tv {
	public LgTv() {
		System.out.println("====>LgTv");
	}
	@Override
	public void turnOn() {
		System.out.println("lgtv turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("lgtv turn off");
		
	}

	@Override
	public void soundUp() {
		System.out.println("lgtv sound up");
		
	}

	@Override
	public void soundDown() {
		System.out.println("lgtv sound down");
		
	}
	

}
