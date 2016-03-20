package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.DecafLatte;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecafLatteTest {
	private DecafLatte decafLatte;
	@Before
	public void setUp() throws Exception {
		decafLatte = new DecafLatte();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		decafLatte.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.2), Method.unifyNum(decafLatte.cost()), 0);
 		decafLatte.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(1.5), Method.unifyNum(decafLatte.cost()), 0);
 		decafLatte.setSize("large");
 		Assert.assertEquals(Method.unifyNum(1.8), Method.unifyNum(decafLatte.cost()), 0);
 		decafLatte.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.1), Method.unifyNum(decafLatte.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Decaf Latte".toCharArray(), decafLatte.getDescription().toCharArray());
	}

}
