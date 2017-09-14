package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee mostHandsomeBestEmployee;
	@Before
	public void setUp() throws Exception {
		mostHandsomeBestEmployee = new Employee(12345, "Samuel", "Niehaus", 1000000.00);
	}

	@Test
	public void testRaiseSalary() {
		mostHandsomeBestEmployee.raiseSalary(50);
		assertEquals(1500000.00 , mostHandsomeBestEmployee.getAnnualSalary() , 0.0001);
	}
	@Test
	public void testRaiseTooLow() {
		mostHandsomeBestEmployee.raiseSalary(-100);
		assertEquals(1000000.00 , mostHandsomeBestEmployee.getAnnualSalary() , 0.0001);
	}

}
