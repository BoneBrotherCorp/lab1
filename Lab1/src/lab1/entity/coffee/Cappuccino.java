package lab1.entity.coffee;

import lab1.entity.Beverage;
import lab1.entity.ingredient.WhipCream;
import lab1.handler.NoSuchSizeException;

public class Cappuccino extends Espresso {
	private Beverage cappuccino;
	
	public Cappuccino() {
		cappuccino = new WhipCream(new Espresso());
		this.description = "Cappuccino";
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		cappuccino.setSize(size);
	}
	
	public double cost() {
		return cappuccino.cost();
	}
}
