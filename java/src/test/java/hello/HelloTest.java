package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

	@Test
	public void testHello() {
		Hello h = new Hello();
		assertEquals(h.greet(), "Hello, world");
	}
}