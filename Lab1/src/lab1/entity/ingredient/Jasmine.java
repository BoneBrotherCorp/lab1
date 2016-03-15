package lab1.entity.ingredient;

import lab1.entity.Beverage;
import lab1.entity.BeverageWithIngredient;


public class Jasmine extends BeverageWithIngredient {
	public Jasmine(Beverage drink) {
		super(drink);
		description += " jasmine";
	}

	public double cost() {
		return 0.5 + super.cost();
	}
}
