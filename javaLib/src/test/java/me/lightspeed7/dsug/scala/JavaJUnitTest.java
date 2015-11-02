package me.lightspeed7.dsug.scala;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaJUnitTest {

	@Test
	public void jUnitTest() {
		assertEquals("Hello DaVe.", File.sayHello("DaVe."));
	}
}
