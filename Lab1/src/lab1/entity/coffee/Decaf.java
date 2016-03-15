package lab1.entity.coffee;

import lab1.entity.CoffeeBeverage;


public class Decaf extends CoffeeBeverage {
	
	public Decaf() {
		description = "Decaf";
	}
	
	public double cost() {
		return super.cost() + 0.5;
	}
}
