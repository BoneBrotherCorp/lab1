package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.tea.GingerTea;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GingerTeaTest {
	private GingerTea gingerTea;
	@Before
	public void setUp() throws Exception {
		gingerTea = new GingerTea();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		gingerTea.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.8),Method.unifyNum( gingerTea.cost()), 0);
 		gingerTea.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(2.1),Method.unifyNum( gingerTea.cost()), 0);
 		gingerTea.setSize("large");
 		Assert.assertEquals(Method.unifyNum(2.3),Method.unifyNum( gingerTea.cost()), 0);
 		gingerTea.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.5),Method.unifyNum( gingerTea.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Ginger Tea".toCharArray(), gingerTea.getDescription().toCharArray());
	}
}
