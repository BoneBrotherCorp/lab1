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
import lab1.entity.ingredient.Ginger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GingerTest {
	private Ginger[] gingers = new Ginger[9];
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
		gingers[0] = new Ginger(cappuccino);
		gingers[1] = new Ginger(decaf);
		gingers[2] = new Ginger(decafcappuccino);
		gingers[3] = new Ginger(decaflatte);
		gingers[4] = new Ginger(decafmocha);
		gingers[5] = new Ginger(espresso);
		gingers[6] = new Ginger(houseblend);
		gingers[7] = new Ginger(latte);
		gingers[8] = new Ginger(mocha);
		cappuccino.setSize("small");
		decaf.setSize("small");
		decafcappuccino.setSize("small");
		decaflatte.setSize("small");
		decafmocha.setSize("small");
		espresso.setSize("small");
		houseblend.setSize("small");
		latte.setSize("small");
		mocha.setSize("small");
		/**the setSize method of Ginger invokes the setSize method of its parameter,thus just test
		 * one size is ok*/
		for (int i = 0; i < gingers.length; i++) {
			gingers[i].setSize("small");
		}
	}
	@Test
	public void testCost() {
		Assert.assertEquals(gingers[0].cost(),cappuccino.cost()+0.6,0);
		Assert.assertEquals(gingers[1].cost(),decaf.cost()+0.6,0);
		Assert.assertEquals(gingers[2].cost(),decafcappuccino.cost()+0.6,0);
		Assert.assertEquals(gingers[3].cost(),decaflatte.cost()+0.6,0);
		Assert.assertEquals(gingers[4].cost(),decafmocha.cost()+0.6,0);
		Assert.assertEquals(gingers[5].cost(),espresso.cost()+0.6,0);
		Assert.assertEquals(gingers[6].cost(),houseblend.cost()+0.6,0);
		Assert.assertEquals(gingers[7].cost(),latte.cost()+0.6,0);
		Assert.assertEquals(gingers[8].cost(),mocha.cost()+0.6,0);
	}

	@Test
	public void testGetDescription() {
		Assert.assertArrayEquals("Cappuccino ginger".toCharArray(),gingers[0].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf ginger".toCharArray(),gingers[1].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Cappuccino ginger".toCharArray(),gingers[2].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Latte ginger".toCharArray(),gingers[3].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Mocha ginger".toCharArray(),gingers[4].getDescription().toCharArray());
		Assert.assertArrayEquals("Espresso ginger".toCharArray(),gingers[5].getDescription().toCharArray());
		Assert.assertArrayEquals("HouseBlend ginger".toCharArray(),gingers[6].getDescription().toCharArray());
		Assert.assertArrayEquals("Latte ginger".toCharArray(),gingers[7].getDescription().toCharArray());
		Assert.assertArrayEquals("Mocha ginger".toCharArray(),gingers[8].getDescription().toCharArray());
	}

}
