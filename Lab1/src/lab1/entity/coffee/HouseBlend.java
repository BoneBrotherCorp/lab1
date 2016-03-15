package lab1.entity.coffee;

import lab1.entity.CoffeeBeverage;


public class HouseBlend extends CoffeeBeverage {
	
	public HouseBlend() {
		description = "HouseBlend";
	}
	
	public double cost() {
		return super.cost() + 0.8;
	}
}
