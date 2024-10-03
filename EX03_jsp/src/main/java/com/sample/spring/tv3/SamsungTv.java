package com.sample.spring.tv3;

public class SamsungTv implements Tv {
	public SamsungTv() {
		System.out.println("=====>SamsungTv");
	}

	@Override
	public void turnOn() {
		System.out.println("samsung turn on");
		
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
