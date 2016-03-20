package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.size.TeaBased;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeaBasedTest {
	TeaBased tb;

	@Before
	public void setUp() throws Exception {
		tb = new TeaBased();
	}

	@Test(timeout = 1000)
	public void testSizeCost() {
		try {
			Assert.assertEquals(0.2, tb.sizeCost("small"), 0);
			Assert.assertEquals(0.5, tb.sizeCost("medium"), 0);
			Assert.assertEquals(0.7, tb.sizeCost("large"), 0);
			Assert.assertEquals(0.9, tb.sizeCost("grand"), 0);
		} catch (NoSuchSizeException e) {
			e.printStackTrace();
			e.printMessage();
		}
		
	}

}
