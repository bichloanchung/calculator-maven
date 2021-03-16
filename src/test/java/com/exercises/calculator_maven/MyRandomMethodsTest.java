package com.exercises.calculator_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTest {
	MyRandomMethods mrd = new MyRandomMethods();

	@Test
	public void testBetween1And10() {
		int result = mrd.randomBetween1and10();
		assertTrue((result >=1) && (result <=10));
	}
	
	@Test
	public void testBetween11And20() {
		int result = mrd.randomBetween11and20();
		assertTrue((result >=11) && (result <=20));
	}
	
	@Test
	public void testBetween21And30() {
		int result = mrd.randomBetween21and30();
		assertTrue((result >=21) && (result <=30));
	}
	
	@Test
	public void testBetween31And40() {
		int result = mrd.randomBetween31and40();
		assertTrue((result >=31) && (result <=40));
	}
	
	@Test
	public void testBetween41And50() {
		int result = mrd.randomBetween41and50();
		assertTrue((result >=41) && (result <=50));
	}

}
