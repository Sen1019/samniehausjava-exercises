package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	KataFizzBuzz sut;
	
	@Before
	public void setUp(){
		
		sut = new KataFizzBuzz();
		
	}
	
	@Test
	public void testOutOfBoundsHigh(){
		assertEquals("", sut.fizzBuzz(101));
	}
	
	@Test
	public void testOutOfBoundsLow(){
		assertEquals("", sut.fizzBuzz(0));
	}
	
	@Test
	public void testDivisibleByFive(){
		assertEquals("Buzz", sut.fizzBuzz(5));
	}
	
	@Test
	public void testDivisibleBy3(){
		assertEquals("Fizz", sut.fizzBuzz(3));
	}
	
	@Test
	public void testDivisibleByFifteen(){
		assertEquals("FizzBuzz", sut.fizzBuzz(15));
	}
	
	@Test
	public void testNotDivisibleByFiveOrThree(){
		assertEquals("13", sut.fizzBuzz(13));
	}
}
