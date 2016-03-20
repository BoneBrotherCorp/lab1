package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.tea.TeaLatte;
import lab1.handler.NoSuchSizeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeaLatteTest {
	private TeaLatte teaLatte;
	@Before
	public void setUp() throws Exception {
		teaLatte = new TeaLatte();
	}
	
	@Test
	public void testCost() throws NoSuchSizeException {
 		teaLatte.setSize("small");
 		Assert.assertEquals(Method.unifyNum(1.3),Method.unifyNum( teaLatte.cost()), 0);
 		teaLatte.setSize("medium");
 		Assert.assertEquals(Method.unifyNum(1.6),Method.unifyNum( teaLatte.cost()), 0);
 		teaLatte.setSize("large");
 		Assert.assertEquals(Method.unifyNum(1.8),Method.unifyNum( teaLatte.cost()), 0);
 		teaLatte.setSize("grand");
 		Assert.assertEquals(Method.unifyNum(2.0),Method.unifyNum( teaLatte.cost()), 0);
	}

	@Test
	public void testGetDescription() {
		assertArrayEquals("Tea Latte".toCharArray(), teaLatte.getDescription().toCharArray());
	}

}
