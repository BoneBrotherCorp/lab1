package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.tea.RedTea;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RedTeaTest {
	private RedTea redTea;
	@Before
	public void setUp() throws Exception {
		redTea = new RedTea();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		redTea.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.0),Method.unifyNum( redTea.cost()), 0);
 		redTea.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(1.3),Method.unifyNum( redTea.cost()), 0);
 		redTea.setSize("large");
 		Assert.assertEquals(Method.unifyNum(1.5),Method.unifyNum( redTea.cost()), 0);
 		redTea.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(1.7),Method.unifyNum( redTea.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Red Tea".toCharArray(), redTea.getDescription().toCharArray());
	}
}
