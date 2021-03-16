package com.exercises.calculator_maven;

public class Main {

	public static void main(String[] args) {
		MyRandomMethods mrd = new MyRandomMethods();
		for(int i = 0; i < 10; i++) {
		int x = mrd.randomBetween11and20();
		System.out.println(x);
		}
	}

}
