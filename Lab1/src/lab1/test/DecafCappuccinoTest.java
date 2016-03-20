package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.DecafCappuccino;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecafCappuccinoTest {
	private DecafCappuccino decafCappuccino;
	@Before
	public void setUp() throws Exception {
		decafCappuccino = new DecafCappuccino();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		decafCappuccino.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.2), Method.unifyNum(decafCappuccino.cost()), 0);
 		decafCappuccino.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(1.5), Method.unifyNum(decafCappuccino.cost()), 0);
 		decafCappuccino.setSize("large");
 		Assert.assertEquals(Method.unifyNum(1.8), Method.unifyNum(decafCappuccino.cost()), 0);
 		decafCappuccino.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.1), Method.unifyNum(decafCappuccino.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Decaf Cappuccino".toCharArray(), decafCappuccino.getDescription().toCharArray());
	}

}
