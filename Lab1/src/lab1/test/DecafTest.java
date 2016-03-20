package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.Decaf;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecafTest {
	private Decaf decaf;
	@Before
	public void setUp() throws Exception {
		decaf = new Decaf();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		decaf.setSize("small");
 		Assert.assertEquals(0.9, decaf.cost(), 0);
 		decaf.setSize("medium");
 		Assert.assertEquals(1.2, decaf.cost(), 0);
 		decaf.setSize("large");
 		Assert.assertEquals(1.5, decaf.cost(),0);
 		decaf.setSize("grand");
 		Assert.assertEquals(1.8, decaf.cost(),0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Decaf".toCharArray(), decaf.getDescription().toCharArray());
	}

}
