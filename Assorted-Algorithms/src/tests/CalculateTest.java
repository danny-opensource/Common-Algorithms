package tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

	Calculate calc = new Calculate();
	int sum = calc.sum(2, 5);

	int testSum = 10;

	@Test
	public void testSum()
	{
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}
}
