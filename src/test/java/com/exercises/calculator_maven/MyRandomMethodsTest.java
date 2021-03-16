package com.exercises.calculator_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTest {
	MyRandomMethods mrd = new MyRandomMethods();
	
	@Test
	public void testBetween1And10_1st() {
		int result = mrd.randomBetween1and10();
		assertTrue((result >= 1) && (result <= 10));
	}
	@Test
	public void testBetween1And10_2nd() {
		int result = mrd.randomBetween1and10();
		assertFalse((result < 1) || (result > 10));
	}
	@Test
	public void testBetween1And10_3nd() {
		int result = mrd.randomBetween1and10();
		assertEquals(true,(result >= 1) && (result <= 10));
	}
	
	@Test
	public void testBetween11And20_1st() {
		int result = mrd.randomBetween11and20();
		assertTrue((result >= 11) && (result <= 20));
	}
	@Test
	public void testBetween11And20_2nd() {
		int result = mrd.randomBetween11and20();
		assertFalse((result < 11) || (result > 20));
	}
	@Test
	public void testBetween11And20_3nd() {
		int result = mrd.randomBetween11and20();
		assertEquals(true, (result >= 11) && (result <= 20));
	}
	
	@Test
	public void testBetween21And30_1st() {
		int result = mrd.randomBetween21and30();
		assertTrue((result >= 21) && (result <= 30));
	}
	@Test
	public void testBetween21And30_2nd() {
		int result = mrd.randomBetween21and30();
		assertFalse((result < 21) || (result > 30));
	}
	@Test
	public void testBetween21And30_3nd() {
		int result = mrd.randomBetween21and30();
		assertEquals(true, (result >= 21) && (result <= 30));
	}
	
	@Test
	public void testBetween31And40_1st() {
		int result = mrd.randomBetween31and40();
		assertTrue((result >= 31) && (result <= 40));
	}
	@Test
	public void testBetween31And40_2nd() {
		int result = mrd.randomBetween31and40();
		assertFalse((result < 31) || (result > 40));
	}
	@Test
	public void testBetween31And40_3nd() {
		int result = mrd.randomBetween31and40();
		assertEquals(true, (result >= 31) && (result <= 40));
	}
	
	@Test
	public void testBetween41And50_1st() {
		int result = mrd.randomBetween41and50();
		assertTrue((result >= 41) && (result <= 50));
	}
	@Test
	public void testBetween41And50_2nd() {
		int result = mrd.randomBetween41and50();
		boolean between = ((result >= 41) && (result <= 50)); //condition returns true
		assertFalse(!between); //make condition <<!true>>, so --> false
	}
	@Test
	public void testBetween41And50_3nd() {
		int result = mrd.randomBetween41and50();
		assertEquals(true, (result >= 41) && (result <= 50));
	}

}
