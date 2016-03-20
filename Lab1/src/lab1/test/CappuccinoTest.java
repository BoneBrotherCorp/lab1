package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.Cappuccino;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CappuccinoTest {
	private Cappuccino cappuccino;
	@Before
	public void setUp() throws Exception {
		cappuccino = new Cappuccino();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		cappuccino.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.7), Method.unifyNum(cappuccino.cost()), 0);
 		cappuccino.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(2.0), Method.unifyNum(cappuccino.cost()), 0);
 		cappuccino.setSize("large");
 		Assert.assertEquals(Method.unifyNum(2.3), Method.unifyNum(cappuccino.cost()), 0);
 		cappuccino.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.6), Method.unifyNum(cappuccino.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Cappuccino".toCharArray(), cappuccino.getDescription().toCharArray());
	}

}
