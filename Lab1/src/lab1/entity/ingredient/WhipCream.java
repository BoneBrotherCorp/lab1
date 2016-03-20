package lab1.entity.ingredient;

import lab1.entity.Beverage;
import lab1.entity.BeverageWithIngredient;


public class WhipCream extends BeverageWithIngredient {
	public WhipCream(Beverage drink) {
		super(drink);
		description += " whip";
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
