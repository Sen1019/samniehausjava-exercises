package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {
	SmartPhone sut;
	@Before
	public void setUp() throws Exception {
		sut = new SmartPhone("4401234567","Carrier");
	}

	@Test
	public void testBatteryRecharge() {
		sut.RechargeBattery();
		assert(sut.getBatteryCharge() == 100);
	}
	@Test
	public void testNoHangUpToggle(){
		sut.HangUp();
		assert!(sut.isOnCall());
		sut.HangUp();
		assert!(sut.isOnCall());
	}
	@Test
	public void testTooLongOutgoingCall(){
		sut.RechargeBattery();
		assert!(sut.Call("4400987654", 105));
		assert(sut.getBatteryCharge()==100);
	}
	@Test
	public void testNotTheRightNumberOfNumbersInThePhoneNumber(){
		sut.RechargeBattery();
		assert!(sut.Call("7777777", 50));
	}
	@Test
	public void testGoodPhoneCall(){
		sut.RechargeBattery();
		assert(sut.Call("4400987654", 75));
		assert(sut.getBatteryCharge() == 25);
	}
		
}
