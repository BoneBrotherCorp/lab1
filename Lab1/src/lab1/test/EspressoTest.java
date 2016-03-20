package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.Espresso;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EspressoTest {
	private Espresso espresso;
	@Before
	public void setUp() throws Exception {
		espresso = new Espresso();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		espresso.setSize("small");
 		Assert.assertEquals(1.4, espresso.cost(), 0);
 		espresso.setSize("medium");
 		Assert.assertEquals(1.7, espresso.cost(), 0);
 		espresso.setSize("large");
 		Assert.assertEquals(2.0, espresso.cost(),0);
 		espresso.setSize("grand");
 		Assert.assertEquals(2.3, espresso.cost(),0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Espresso".toCharArray(), espresso.getDescription().toCharArray());
	}

}
