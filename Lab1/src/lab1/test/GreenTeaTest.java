package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.Beverage;
import lab1.entity.ingredient.Jasmine;
import lab1.entity.tea.GreenTea;
import lab1.entity.tea.GreenTea;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreenTeaTest {
	private GreenTea greenTea;
	@Before
	public void setUp() throws Exception {
		greenTea = new GreenTea();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		greenTea.setSize("small");
 		Assert.assertEquals(1.2, greenTea.cost(), 0);
 		greenTea.setSize("medium");
 		Assert.assertEquals(1.5, greenTea.cost(), 0);
 		greenTea.setSize("large");
 		Assert.assertEquals(1.7, greenTea.cost(),0);
 		greenTea.setSize("grand");
 		Assert.assertEquals(1.9, greenTea.cost(),0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Green Tea".toCharArray(), greenTea.getDescription().toCharArray());
	}

}
