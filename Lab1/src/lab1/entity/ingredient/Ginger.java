package lab1.entity.ingredient;

import lab1.entity.Beverage;
import lab1.entity.BeverageWithIngredient;

public class Ginger extends BeverageWithIngredient {
	public Ginger(Beverage drink) {
		super(drink);
		description += " ginger";
	}

	public double cost() {
		return 0.6 + super.cost();
	}
}