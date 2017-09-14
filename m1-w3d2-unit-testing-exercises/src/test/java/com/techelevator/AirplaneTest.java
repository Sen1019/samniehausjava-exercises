package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	
	Airplane sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Airplane("ABC123", 10, 100);
	}

	@Test  //Also covers booked seat check, as available is derived from it.
	public void testCorrectFirstClassAfterBooking() {
		sut.Reserve(true, 9);
		assertEquals(1, sut.getAvailableFirstClassSeats());
	}
	@Test
	public void testCorrectCoachAfterBooking() {
		sut.Reserve(false, 9);
		assertEquals(91, sut.getAvailableCoachSeats());
	}
	@Test
	public void testOverbookingFirstClass(){
		assert!(sut.Reserve(true, 11));
	}
	@Test
	public void testOverbookingCoach(){
		assert!(sut.Reserve(false, 101));
	}
}
