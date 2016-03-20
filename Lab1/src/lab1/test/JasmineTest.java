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
import lab1.entity.ingredient.Jasmine;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JasmineTest {
	private Jasmine[] jasmines = new Jasmine[9];
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
		jasmines[0] = new Jasmine(cappuccino);
		jasmines[1] = new Jasmine(decaf);
		jasmines[2] = new Jasmine(decafcappuccino);
		jasmines[3] = new Jasmine(decaflatte);
		jasmines[4] = new Jasmine(decafmocha);
		jasmines[5] = new Jasmine(espresso);
		jasmines[6] = new Jasmine(houseblend);
		jasmines[7] = new Jasmine(latte);
		jasmines[8] = new Jasmine(mocha);
		cappuccino.setSize("small");
		decaf.setSize("small");
		decafcappuccino.setSize("small");
		decaflatte.setSize("small");
		decafmocha.setSize("small");
		espresso.setSize("small");
		houseblend.setSize("small");
		latte.setSize("small");
		mocha.setSize("small");
		/**the setSize method of Jasmine invokes the setSize method of its parameter,thus just test
		 * one size is ok*/
		for (int i = 0; i < jasmines.length; i++) {
			jasmines[i].setSize("small");
		}
	}
	@Test
	public void testCost() {
		Assert.assertEquals(jasmines[0].cost(),cappuccino.cost()+0.5,0);
		Assert.assertEquals(jasmines[1].cost(),decaf.cost()+0.5,0);
		Assert.assertEquals(jasmines[2].cost(),decafcappuccino.cost()+0.5,0);
		Assert.assertEquals(jasmines[3].cost(),decaflatte.cost()+0.5,0);
		Assert.assertEquals(jasmines[4].cost(),decafmocha.cost()+0.5,0);
		Assert.assertEquals(jasmines[5].cost(),espresso.cost()+0.5,0);
		Assert.assertEquals(jasmines[6].cost(),houseblend.cost()+0.5,0);
		Assert.assertEquals(jasmines[7].cost(),latte.cost()+0.5,0);
		Assert.assertEquals(jasmines[8].cost(),mocha.cost()+0.5,0);
	}

	@Test
	public void testGetDescription() {
		Assert.assertArrayEquals("Cappuccino jasmine".toCharArray(),jasmines[0].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf jasmine".toCharArray(),jasmines[1].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Cappuccino jasmine".toCharArray(),jasmines[2].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Latte jasmine".toCharArray(),jasmines[3].getDescription().toCharArray());
		Assert.assertArrayEquals("Decaf Mocha jasmine".toCharArray(),jasmines[4].getDescription().toCharArray());
		Assert.assertArrayEquals("Espresso jasmine".toCharArray(),jasmines[5].getDescription().toCharArray());
		Assert.assertArrayEquals("HouseBlend jasmine".toCharArray(),jasmines[6].getDescription().toCharArray());
		Assert.assertArrayEquals("Latte jasmine".toCharArray(),jasmines[7].getDescription().toCharArray());
		Assert.assertArrayEquals("Mocha jasmine".toCharArray(),jasmines[8].getDescription().toCharArray());
	}

}
