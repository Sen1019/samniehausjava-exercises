package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	Elevator sut;
	@Before
	public void setUp() throws Exception {
		sut = new Elevator(10);  //This failed, telling me that the constructor was wrong.
	}

	@Test
	public void testClose() {
		sut.CloseDoor();
		sut.CloseDoor();
		assertFalse(sut.isDoorOpen());
	}
	@Test
	public void testOpen() {
		sut.CloseDoor();
		sut.OpenDoor();
		sut.OpenDoor();
		assertTrue(sut.isDoorOpen());
	}
	@Test
	public void testGoUp(){
		sut.CloseDoor();
		sut.GoUp(4);
		assertEquals(4, sut.getCurrentLevel());
	}
	@Test
	public void testGoDown(){
		sut.CloseDoor();
		sut.GoUp(4);
		sut.GoDown(2);
		assertEquals(2, sut.getCurrentLevel());
	}
	@Test
	public void testMovingWhenOpen() {
		sut.OpenDoor();
		assertFalse(sut.GoUp(3));
	}
	@Test
	public void testGoUpTooMuch(){
		sut.CloseDoor();
		assertFalse(sut.GoUp(11));
		assertEquals(1, sut.getCurrentLevel());
	}
	@Test
	public void testGoDownTooMuch(){
		sut.CloseDoor();
		assertFalse(sut.GoUp(0));
		assertEquals(1, sut.getCurrentLevel());
	}
}