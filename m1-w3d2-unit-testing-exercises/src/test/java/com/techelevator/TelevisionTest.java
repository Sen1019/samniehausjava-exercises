package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	Television sut;
	@Before
	public void setUp() throws Exception {
		sut = new Television();
	}
	@Test
	public void testOn(){
		sut.TurnOn();
		assertTrue(sut.IsOn());
	}
	@Test
	public void testOff(){
		sut.TurnOff();
		assertFalse(sut.IsOn());
	}
	@Test
	public void testChannelInRange(){
		sut.TurnOn();
		sut.ChangeChannel(10);
		assertEquals(10, sut.getSelectedChannel());
	}
	@Test
	public void testChannelInRangeHigh(){
		sut.TurnOn();
		sut.ChangeChannel(10);
		sut.ChangeChannel(18);
		assertEquals(18, sut.getSelectedChannel());
	}
	@Test
	public void testChannelInRangeLow(){
		sut.TurnOn();
		sut.ChangeChannel(10);
		sut.ChangeChannel(3);
		assertEquals(3, sut.getSelectedChannel());
	}	
	
	@Test
	public void testVolumeTooHigh() {
		sut.TurnOn();
		sut.ChangeChannel(10);
		sut.ChangeChannel(20);
		assertEquals(10, sut.getSelectedChannel());
	}
	@Test
	public void testVolumeTooLow() {
		sut.TurnOn();
		sut.ChangeChannel(10);
		sut.ChangeChannel(0);
		assertEquals(10, sut.getSelectedChannel());
	}
	@Test
	public void testChannelResetWhenTurnedOn(){
		sut.TurnOn();
		sut.ChangeChannel(10);
		sut.TurnOff();
		sut.TurnOn();
		assertEquals(3, sut.getSelectedChannel());
	}
	@Test
	public void testVolumeLow(){
		sut.TurnOn();
		for(int i = 0; i < 20; i++){
			sut.LowerVolume();
		}
		assertEquals(0 , sut.getCurrentVolume());
	}
	@Test
	public void testVolumeHigh(){
		sut.TurnOn();
		for(int i = 0; i < 20; i++){
			sut.RaiseVolume();
		}
		assertEquals(10 , sut.getCurrentVolume());
	}
}
