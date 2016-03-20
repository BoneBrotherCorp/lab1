package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.Latte;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LatteTest {
	private Latte latte;
	@Before
	public void setUp() throws Exception {
		latte = new Latte();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		latte.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.7),Method.unifyNum(latte.cost()), 0);
 		latte.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(2),Method.unifyNum(latte.cost()), 0);
 		latte.setSize("large");
 		Assert.assertEquals(Method.unifyNum(2.3),Method.unifyNum(latte.cost()), 0);
 		latte.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.6),Method.unifyNum(latte.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Latte".toCharArray(), latte.getDescription().toCharArray());
	}


}
