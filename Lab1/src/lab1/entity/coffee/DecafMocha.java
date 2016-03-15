package lab1.entity.coffee;

import lab1.entity.Beverage;
import lab1.entity.ingredient.Chocolate;
import lab1.handler.NoSuchSizeException;

public class DecafMocha extends Decaf {
	private Beverage decafMocha;
	
	public DecafMocha() {
		decafMocha = new Chocolate(new Decaf());
		this.description = "Decaf Mocha";
	}
	
	public double cost() {
		return decafMocha.cost();
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		decafMocha.setSize(size);
	}
}
