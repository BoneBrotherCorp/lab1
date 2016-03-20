package lab1.entity.coffee;

import lab1.entity.Beverage;
import lab1.entity.ingredient.Milk;
import lab1.handler.NoSuchSizeException;

public class Latte extends Espresso {
	private Beverage latte;
	
	public Latte() {
		latte = new Milk(new Espresso());
		this.description = "Latte";
	}
	
	public double cost() {
		return latte.cost();
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		latte.setSize(size);
	}
	
}
