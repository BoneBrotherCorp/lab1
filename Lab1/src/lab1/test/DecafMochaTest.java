package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.DecafMocha;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecafMochaTest {
	private DecafMocha decafMocha;
	@Before
	public void setUp() throws Exception {
		decafMocha = new DecafMocha();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		decafMocha.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.2), Method.unifyNum(decafMocha.cost()), 0);
 		decafMocha.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(1.5), Method.unifyNum(decafMocha.cost()), 0);
 		decafMocha.setSize("large");
 		Assert.assertEquals(Method.unifyNum(1.8), Method.unifyNum(decafMocha.cost()), 0);
 		decafMocha.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.1), Method.unifyNum(decafMocha.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Decaf Mocha".toCharArray(), decafMocha.getDescription().toCharArray());
	}

}
