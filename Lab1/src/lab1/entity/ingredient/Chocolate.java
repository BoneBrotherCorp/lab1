package lab1.entity.ingredient;

import lab1.entity.Beverage;
import lab1.entity.BeverageWithIngredient;


public class Chocolate extends BeverageWithIngredient {
	public Chocolate(Beverage drink) {
		super(drink);
		description += " chocolate";
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
