package lab1.test;

import lab1.entity.BeverageFactory;
import lab1.handler.NoSuchBeverageException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeverageFactoryTest {
	BeverageFactory bf;
	@Before
	public void setUp() throws Exception {
		bf = BeverageFactory.getFactory();
	}

	@Test(timeout = 1000)
	public void testgetBeverage() throws InstantiationException, IllegalAccessException{
		try {
			Assert.assertEquals("","espresso", bf.getBeverage("espresso").getDescription().toLowerCase());
			Assert.assertEquals("","decaf", bf.getBeverage("decaf").getDescription().toLowerCase());
			Assert.assertEquals("","houseblend", bf.getBeverage("houseblend").getDescription().toLowerCase());
			Assert.assertEquals("","mocha", bf.getBeverage("mocha").getDescription().toLowerCase());
			Assert.assertEquals("","latte", bf.getBeverage("latte").getDescription().toLowerCase());
			Assert.assertEquals("","cappuccino", bf.getBeverage("cappuccino").getDescription().toLowerCase());
			Assert.assertEquals("","decaf mocha", bf.getBeverage("decaf mocha").getDescription().toLowerCase());
			Assert.assertEquals("","decaf latte", bf.getBeverage("decaf latte").getDescription().toLowerCase());
			Assert.assertEquals("","decaf cappuccino", bf.getBeverage("decaf cappuccino").getDescription().toLowerCase());
			Assert.assertEquals("","green tea", bf.getBeverage("green tea").getDescription().toLowerCase());
			Assert.assertEquals("","red tea", bf.getBeverage("red tea").getDescription().toLowerCase());
			Assert.assertEquals("","white tea", bf.getBeverage("white tea").getDescription().toLowerCase());
			Assert.assertEquals("","flower tea", bf.getBeverage("flower tea").getDescription().toLowerCase());
			Assert.assertEquals("","ginger tea", bf.getBeverage("ginger tea").getDescription().toLowerCase());
			Assert.assertEquals("","tea latte", bf.getBeverage("tea latte").getDescription().toLowerCase());
		} catch (NoSuchBeverageException e) {
			e.printStackTrace();
			e.printMessage();
		}
		
	}
}
