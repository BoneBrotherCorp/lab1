package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.tea.FlowerTea;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlowerTeaTest {
	private FlowerTea flowerTea;
	@Before
	public void setUp() throws Exception {
		flowerTea = new FlowerTea();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		flowerTea.setSize("small");
 		Assert.assertEquals(1.7, flowerTea.cost(), 0);
 		flowerTea.setSize("medium");
 		Assert.assertEquals(2.0, flowerTea.cost(), 0);
 		flowerTea.setSize("large");
 		Assert.assertEquals(2.2, flowerTea.cost(),0);
 		flowerTea.setSize("grand");
 		Assert.assertEquals(2.4, flowerTea.cost(),0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Flower Tea".toCharArray(), flowerTea.getDescription().toCharArray());
	}

}
