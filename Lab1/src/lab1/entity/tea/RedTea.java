package lab1.entity.tea;

import lab1.entity.TeaBeverage;


public class RedTea extends TeaBeverage {
	
	public RedTea() {
		description = "Red Tea";
	}
	
	public double cost() {
		return super.cost() + 0.8;
	}
}
