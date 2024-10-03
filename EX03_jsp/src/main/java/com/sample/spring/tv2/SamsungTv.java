package com.sample.spring.tv2;

public class SamsungTv implements Tv {
	public SamsungTv() {
		System.out.println("---->SamsungTv");
	}
	@Override
	public void turnOn() {
		System.out.println("samsungtv turn on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("samsung tv turn off");
		
	}

	@Override
	public void soundUp() {
		System.out.println("samsung tv sound up");
		
	}

	@Override
	public void soundDown() {
		System.out.println("samsung tv sound down");
		
	}

}
