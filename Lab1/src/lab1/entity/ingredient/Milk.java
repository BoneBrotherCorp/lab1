package lab1.entity.ingredient;

import lab1.entity.Beverage;
import lab1.entity.BeverageWithIngredient;


public class Milk extends BeverageWithIngredient {
	
	public Milk(Beverage drink) {
		super(drink);
		description += " milk";
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
