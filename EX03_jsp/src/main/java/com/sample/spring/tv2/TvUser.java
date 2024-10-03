package com.sample.spring.tv2;

public class TvUser {
	public static void main(String[] args) {
		Tv tv = new LgTv();
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
	}
}
