package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {

	KataPotter sut;
	
	@Before
	public void setup(){
		sut = new KataPotter();
	}
	
	@Test
	public void testOneOne(){
		assertEquals(8.0,sut.getCost(new Integer[]{0,0,1,0,0}), 0.00001);
	}
	@Test
	public void testOneFour(){
		assertEquals(25.6,sut.getCost(new Integer[]{1,1,1,0,1}), 0.00001);
	}
	@Test
	public void testOneFiveOneOne(){
		assertEquals(38,sut.getCost(new Integer[]{1,1,2,1,1}), 0.00001);
	}
	@Test
	public void testFivesAndThreesToFours(){
		assertEquals(51.2,sut.getCost(new Integer[]{2,1,2,1,2}), 0.00001);
	}
	@Test
	public void testFiveOnes(){
		assertEquals(40,sut.getCost(new Integer[]{5,0,0,0,0}), 0.00001);
	}
}


