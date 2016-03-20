package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.Mocha;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MochaTest {
	private Mocha mocha;
	@Before
	public void setUp() throws Exception {
		mocha = new Mocha();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		mocha.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.7),Method.unifyNum(mocha.cost()), 0);
 		mocha.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(2),Method.unifyNum(mocha.cost()), 0);
 		mocha.setSize("large");
 		Assert.assertEquals(Method.unifyNum(2.3),Method.unifyNum(mocha.cost()), 0);
 		mocha.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.),Method.unifyNum(mocha.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Mocha".toCharArray(), mocha.getDescription().toCharArray());
	}

}
