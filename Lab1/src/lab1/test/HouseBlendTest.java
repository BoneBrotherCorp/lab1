package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.HouseBlend;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HouseBlendTest {
	private HouseBlend houseBlend;
	@Before
	public void setUp() throws Exception {
		houseBlend = new HouseBlend();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		houseBlend.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.2),Method.unifyNum(houseBlend.cost()), 0);
 		houseBlend.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(1.5),Method.unifyNum(houseBlend.cost()), 0);
 		houseBlend.setSize("large");
 		Assert.assertEquals(Method.unifyNum(1.8),Method.unifyNum(houseBlend.cost()), 0);
 		houseBlend.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.1),Method.unifyNum(houseBlend.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("HouseBlend".toCharArray(), houseBlend.getDescription().toCharArray());
	}


}
