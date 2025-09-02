/*
 * Copyright 2021 Marc Liberatore.
 */

package hello;

import static org.junit.Assert.*;

import org.junit.Test;


public class HelloTest {
	@Test
	public void testHelloString() {
		assertEquals("helloString returns incorrect value", "Hello, CICS 210 Data Structures World!",
				Hello.helloString());
	}
}