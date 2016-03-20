package lab1.test;

import lab1.entity.coffee.Cappuccino;
import lab1.entity.coffee.Decaf;
import lab1.entity.coffee.DecafCappuccino;
import lab1.entity.coffee.DecafLatte;
import lab1.entity.coffee.DecafMocha;
import lab1.entity.coffee.Espresso;
import lab1.entity.coffee.HouseBlend;
import lab1.entity.coffee.Latte;
import lab1.entity.coffee.Mocha;
import lab1.entity.ingredient.Chocolate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChocolateTest {
	private Chocolate[] chocolates = new Chocolate[9];
	private Cappuccino cappuccino = new Cappuccino();
	private Decaf decaf = new Decaf();
	private DecafCappuccino decafcappuccino = new DecafCappuccino();
	private DecafLatte decaflatte = new DecafLatte();
	private DecafMocha decafmocha = new DecafMocha();
	private Espresso espresso = new Espresso();
	private HouseBlend houseblend = new HouseBlend();
	private Latte latte = new Latte();
	private Mocha mocha = new Mocha();
	@Before
	public void setUp() throws Exception{
		chocolates[0] = new Chocolate(cappuccino);
		chocolates[1] = new Chocolate(decaf);
		chocolates[2] = new Chocolate(decafcappuccino);
		chocolates[3] = new Chocolate(decaflatte);
		chocolates[4] = new Chocolate(decafmocha);
		chocolates[5] = new Chocolate(espresso);
		chocolates[6] = new Chocolate(houseblend);
		chocolates[7] = new Chocolate(latte);
		chocolates[8] = new Chocolate(mocha);
		cappuccino.setSize("small");
		decaf.setSize("small");
		decafcappuccino.setSize("small");
		decaflatte.setSize("small");
		decafmocha.setSize("small");
		espresso.setSize("small");
		houseblend.setSize("small");
		latte.setSize("small");
		mocha.setSize("small");
		/**the setSize method of Chocolate invokes the setSize method of its parameter,thus just test
		 * one size is ok*/
		for (int i = 0; i < chocolates.length; i++) {
			chocolates[i].setSize("small");
		}
	}
	@Test
	public void testCost() {
		Assert.assertEquals(chocolates[0].cost(),cappuccino.cost()+0.3,0);
		Assert.assertEquals(chocolates[1].cost(),decaf.cost()+0.3,0);
		Assert.assertEquals(chocolates[2].cost(),decafcappuccino.cost()+0.3,0);
		Assert.assertEquals(chocolates[3].cost(),decaflatte.cost()+0.3,0);
		Assert.assertEquals(chocolates[4].cost(),decafmocha.cost()+0.3,0);
		Assert.assertEquals(chocolates[5].cost(),espresso.cost()+0.3,0);
		Assert.assertEquals(chocolates[6].cost(),houseblend.cost()+0.3,0);
		Assert.assertEquals(chocolates[7].cost(),latte.cost()+0.3,0);
		Assert.assertEquals(chocolates[8].cost(),mocha.cost()+0.3,0);
	}

	@Test
	public void testGetDescription() {
		Assert.assertArrayEquals("Cappuccino chocolate".toCharArray(),chocolates[0].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf chocolate".toCharArray(),chocolates[1].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Cappuccino chocolate".toCharArray(),chocolates[2].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Latte chocolate".toCharArray(),chocolates[3].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Mocha chocolate".toCharArray(),chocolates[4].getDescription().toCharArray());
		Assert.assertArrayEquals("Espresso chocolate".toCharArray(),chocolates[5].getDescription().toCharArray());
		Assert.assertArrayEquals("HouseBlend chocolate".toCharArray(),chocolates[6].getDescription().toCharArray());
		Assert.assertArrayEquals("Latte chocolate".toCharArray(),chocolates[7].getDescription().toCharArray());
		Assert.assertArrayEquals("Mocha chocolate".toCharArray(),chocolates[8].getDescription().toCharArray());
	}

}
