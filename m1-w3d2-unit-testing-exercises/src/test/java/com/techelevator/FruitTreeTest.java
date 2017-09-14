package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	FruitTree durian;
	
	@Before
	public void setUp() throws Exception {
		durian = new FruitTree("Durian",5);
	}

	@Test
	public void testPickAllFruit() {
		assert(durian.PickFruit(5));
	}
	@Test
	public void testPickSomeFruit(){
		assert(durian.PickFruit(3));
	}
	@Test
	public void testAttemptToPickTooMuch(){
		assert !(durian.PickFruit(10));
	}
	@Test
	public void testUnsuccessfulRemove(){
		durian.PickFruit(10);
		assertEquals(durian.getPiecesOfFruitLeft(), 5);
	}
	@Test
	public void testSuccessfulRemove(){
		durian.PickFruit(3);
		assertEquals(durian.getPiecesOfFruitLeft(), 2);
	}
	

}
