package com.exercises.calculator_maven;

import java.util.Random;

public class MyRandomMethods {
	Random rd = new Random();
	/* andra satt att ropa method --rekomendera
	 * public int randomBetween1and10() {
		int result = 0;
		result = rd.nextInt(10)+1;
		return result;
	}*/
	public int randomBetween1and10() {
		return rd.nextInt(10)+1;
	}
	public int randomBetween11and20() {
		return rd.nextInt(10)+11;
	}
	public int randomBetween21and30() {
		return rd.nextInt(10)+21;
	}
	public int randomBetween31and40() {
		return rd.nextInt(10)+31;
	}
	public int randomBetween41and50() {
		return rd.nextInt(10)+41;
	}

}
