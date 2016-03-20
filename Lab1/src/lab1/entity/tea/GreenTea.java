package lab1.entity.tea;

import lab1.entity.TeaBeverage;


public class GreenTea extends TeaBeverage {
	
	public GreenTea() {
		description = "Green Tea";
	}
	
	public double cost() {
		return super.cost() + 1.0;
	}
}
