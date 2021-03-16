package com.exercises.calculator_maven;

import java.util.Random;

public class MyRandomMethods {
	Random rd = new Random();
	public int randomBetween1and10() {
		return rd.nextInt(10)+1;
	}
	public int randomBetween11and20() {
		return rd.nextInt(10)+11;
	}

}
