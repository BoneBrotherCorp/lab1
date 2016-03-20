package lab1.entity.coffee;

import lab1.entity.CoffeeBeverage;


public class Espresso extends CoffeeBeverage {
	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
