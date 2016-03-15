package lab1.entity.coffee;

import lab1.entity.Beverage;
import lab1.entity.ingredient.Milk;
import lab1.handler.NoSuchSizeException;

public class DecafLatte extends Decaf {
	private Beverage decafLatte;
	
	public DecafLatte() {
		decafLatte = new Milk(new Decaf());
		this.description = "Decaf Latte";
	}
	
	public double cost() {
		return decafLatte.cost();
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		decafLatte.setSize(size);
	}
}
