package lab1.test;

import lab1.entity.BeverageFactory;
import lab1.entity.BeverageWithIngredientFactory;
import lab1.entity.size.CoffeeBased;
import lab1.handler.NoSuchBeverageException;
import lab1.handler.NoSuchIngredientException;

import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeverageWithIngredientFactoryTest {
	BeverageWithIngredientFactory bwif;
	BeverageFactory bf;
	@Before
	public void setUp() throws Exception {
		bwif = BeverageWithIngredientFactory.getFactory();
		bf=BeverageFactory.getFactory();
	}

	@Test(timeout = 1000)
	public void testgetBeverageWithIngredient() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchBeverageException{
		try {
			Assert.assertEquals("","espresso ginger", bwif.getBeverageWithIngredient("ginger",bf.getBeverage("espresso")).getDescription().toLowerCase());
			Assert.assertEquals("","decaf milk", bwif.getBeverageWithIngredient("milk",bf.getBeverage("decaf")).getDescription().toLowerCase());
			Assert.assertEquals("","houseblend jasmine", bwif.getBeverageWithIngredient("jasmine",bf.getBeverage("houseblend")).getDescription().toLowerCase());
			Assert.assertEquals("","mocha whip", bwif.getBeverageWithIngredient("whipcream",bf.getBeverage("mocha")).getDescription().toLowerCase());
			Assert.assertEquals("","latte chocolate", bwif.getBeverageWithIngredient("chocolate",bf.getBeverage("latte")).getDescription().toLowerCase());
			
		} catch (NoSuchIngredientException e) {
			e.printStackTrace();
			e.pirntMessage();
		}
		
	}
}
