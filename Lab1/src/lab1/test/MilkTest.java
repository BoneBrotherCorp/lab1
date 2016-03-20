package lab1.test;

import static org.junit.Assert.*;
import lab1.entity.coffee.Cappuccino;
import lab1.entity.coffee.Decaf;
import lab1.entity.coffee.DecafCappuccino;
import lab1.entity.coffee.DecafLatte;
import lab1.entity.coffee.DecafMocha;
import lab1.entity.coffee.Espresso;
import lab1.entity.coffee.HouseBlend;
import lab1.entity.coffee.Latte;
import lab1.entity.coffee.Mocha;
import lab1.entity.ingredient.Milk;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MilkTest {
	private Milk[] milks = new Milk[9];
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
		milks[0] = new Milk(cappuccino);
		milks[1] = new Milk(decaf);
		milks[2] = new Milk(decafcappuccino);
		milks[3] = new Milk(decaflatte);
		milks[4] = new Milk(decafmocha);
		milks[5] = new Milk(espresso);
		milks[6] = new Milk(houseblend);
		milks[7] = new Milk(latte);
		milks[8] = new Milk(mocha);
		cappuccino.setSize("small");
		decaf.setSize("small");
		decafcappuccino.setSize("small");
		decaflatte.setSize("small");
		decafmocha.setSize("small");
		espresso.setSize("small");
		houseblend.setSize("small");
		latte.setSize("small");
		mocha.setSize("small");
		/**the setSize method of Milk invokes the setSize method of its parameter,thus just test
		 * one size is ok*/
		for (int i = 0; i < milks.length; i++) {
			milks[i].setSize("small");
		}
	}
	@Test
	public void testCost() {
		Assert.assertEquals(milks[0].cost(),cappuccino.cost()+0.3,0);
		Assert.assertEquals(milks[1].cost(),decaf.cost()+0.3,0);
		Assert.assertEquals(milks[2].cost(),decafcappuccino.cost()+0.3,0);
		Assert.assertEquals(milks[3].cost(),decaflatte.cost()+0.3,0);
		Assert.assertEquals(milks[4].cost(),decafmocha.cost()+0.3,0);
		Assert.assertEquals(milks[5].cost(),espresso.cost()+0.3,0);
		Assert.assertEquals(milks[6].cost(),houseblend.cost()+0.3,0);
		Assert.assertEquals(milks[7].cost(),latte.cost()+0.3,0);
		Assert.assertEquals(milks[8].cost(),mocha.cost()+0.3,0);
	}

	@Test
	public void testGetDescription() {
		Assert.assertArrayEquals("Cappuccino milk".toCharArray(),milks[0].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf milk".toCharArray(),milks[1].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Cappuccino milk".toCharArray(),milks[2].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Latte milk".toCharArray(),milks[3].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Mocha milk".toCharArray(),milks[4].getDescription().toCharArray());
		Assert.assertArrayEquals("Espresso milk".toCharArray(),milks[5].getDescription().toCharArray());
		Assert.assertArrayEquals("HouseBlend milk".toCharArray(),milks[6].getDescription().toCharArray());
		Assert.assertArrayEquals("Latte milk".toCharArray(),milks[7].getDescription().toCharArray());
		Assert.assertArrayEquals("Mocha milk".toCharArray(),milks[8].getDescription().toCharArray());
	}

}
