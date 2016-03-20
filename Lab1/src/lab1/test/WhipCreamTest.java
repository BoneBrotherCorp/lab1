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
import lab1.entity.ingredient.WhipCream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhipCreamTest {
	private WhipCream[] whipCreams = new WhipCream[9];
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
		whipCreams[0] = new WhipCream(cappuccino);
		whipCreams[1] = new WhipCream(decaf);
		whipCreams[2] = new WhipCream(decafcappuccino);
		whipCreams[3] = new WhipCream(decaflatte);
		whipCreams[4] = new WhipCream(decafmocha);
		whipCreams[5] = new WhipCream(espresso);
		whipCreams[6] = new WhipCream(houseblend);
		whipCreams[7] = new WhipCream(latte);
		whipCreams[8] = new WhipCream(mocha);
		cappuccino.setSize("small");
		decaf.setSize("small");
		decafcappuccino.setSize("small");
		decaflatte.setSize("small");
		decafmocha.setSize("small");
		espresso.setSize("small");
		houseblend.setSize("small");
		latte.setSize("small");
		mocha.setSize("small");
		/**the setSize method of WhipCream invokes the setSize method of its parameter,thus just test
		 * one size is ok*/
		for (int i = 0; i < whipCreams.length; i++) {
			whipCreams[i].setSize("small");
		}
	}
	@Test
	public void testCost() {
		Assert.assertEquals(whipCreams[0].cost(),cappuccino.cost()+0.3,0);
		Assert.assertEquals(whipCreams[1].cost(),decaf.cost()+0.3,0);
		Assert.assertEquals(whipCreams[2].cost(),decafcappuccino.cost()+0.3,0);
		Assert.assertEquals(whipCreams[3].cost(),decaflatte.cost()+0.3,0);
		Assert.assertEquals(whipCreams[4].cost(),decafmocha.cost()+0.3,0);
		Assert.assertEquals(whipCreams[5].cost(),espresso.cost()+0.3,0);
		Assert.assertEquals(whipCreams[6].cost(),houseblend.cost()+0.3,0);
		Assert.assertEquals(whipCreams[7].cost(),latte.cost()+0.3,0);
		Assert.assertEquals(whipCreams[8].cost(),mocha.cost()+0.3,0);
	}

	@Test
	public void testGetDescription() {
		Assert.assertArrayEquals("Cappuccino whip".toCharArray(),whipCreams[0].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf whip".toCharArray(),whipCreams[1].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Cappuccino whip".toCharArray(),whipCreams[2].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Latte whip".toCharArray(),whipCreams[3].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Mocha whip".toCharArray(),whipCreams[4].getDescription().toCharArray());
		Assert.assertArrayEquals("Espresso whip".toCharArray(),whipCreams[5].getDescription().toCharArray());
		Assert.assertArrayEquals("HouseBlend whip".toCharArray(),whipCreams[6].getDescription().toCharArray());
		Assert.assertArrayEquals("Latte whip".toCharArray(),whipCreams[7].getDescription().toCharArray());
		Assert.assertArrayEquals("Mocha whip".toCharArray(),whipCreams[8].getDescription().toCharArray());
	}

}
