package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.tea.WhiteTea;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhiteTeaTest {
	private WhiteTea whiteTea;
	@Before
	public void setUp() throws Exception {
		whiteTea = new WhiteTea();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		whiteTea.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.2),Method.unifyNum( whiteTea.cost()), 0);
 		whiteTea.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(1.5),Method.unifyNum( whiteTea.cost()), 0);
 		whiteTea.setSize("large");
 		Assert.assertEquals(Method.unifyNum(1.7),Method.unifyNum( whiteTea.cost()), 0);
 		whiteTea.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(1.9),Method.unifyNum( whiteTea.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("White Tea".toCharArray(), whiteTea.getDescription().toCharArray());
	}
}
