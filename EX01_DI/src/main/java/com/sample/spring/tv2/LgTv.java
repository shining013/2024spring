package com.sample.spring.tv2;

public class LgTv implements Tv {
	public LgTv() {
		System.out.println("===>LgTv");
	}

	@Override
	public void turnOn() {
		System.out.println("LgTv turn on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("LgTv turn off");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LgTv sound up");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LgTv sound down");
		
	}

}
