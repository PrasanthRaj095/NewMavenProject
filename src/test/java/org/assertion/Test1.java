package org.assertion;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Test1 {
	
	@Test
	public void testOne() {
		System.out.println("Test one");
		Assert.fail();
	}
	
	@Test
	public void testOneTwo() {
		System.out.println("Test One Two");
	}
	@Ignore
	@Test
	public void testOneThree() {
		System.out.println("Test one Three");
	}
	
	
	
	
}
