package lab1.entity;

import lab1.handler.NoSuchSizeException;

public abstract class BeverageWithIngredient extends Beverage {
	private Beverage drink;

	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
		this.description = drink.getDescription();
	}
	
	public double cost() {
		return drink.cost();
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		drink.setSize(size);
	}
}
