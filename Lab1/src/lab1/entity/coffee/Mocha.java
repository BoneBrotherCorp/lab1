package lab1.entity.coffee;

import lab1.entity.Beverage;
import lab1.entity.ingredient.Chocolate;
import lab1.handler.NoSuchSizeException;

public class Mocha extends Espresso {
	private Beverage mocha;
	
	public Mocha() {
		mocha = new Chocolate(new Espresso());
		this.description = "Mocha";
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		mocha.setSize(size);
	}
	
	public double cost() {
		return mocha.cost();
	}
	
}
