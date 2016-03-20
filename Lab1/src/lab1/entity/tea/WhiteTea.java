package lab1.entity.tea;

import lab1.entity.TeaBeverage;


public class WhiteTea extends TeaBeverage {

	public WhiteTea() {
		description = "White Tea";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
