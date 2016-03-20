package lab1.test;


import lab1.entity.size.CoffeeBased;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeBasedTest {
	CoffeeBased cb;

	@Before
	public void setUp() throws Exception {
		cb = new CoffeeBased();
	}

	@Test(timeout = 1000)
	public void testSizeCost() {
		try {
			Assert.assertEquals(0.4, cb.sizeCost("small"), 0);
			Assert.assertEquals(0.7, cb.sizeCost("medium"), 0);
			Assert.assertEquals(1.0, cb.sizeCost("large"), 0);
			Assert.assertEquals(1.3, cb.sizeCost("grand"), 0);
		} catch (NoSuchSizeException e) {
			e.printStackTrace();
			e.printMessage();
		}
		
	}

}
