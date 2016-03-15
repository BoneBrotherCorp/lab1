package lab1.entity.coffee;

import lab1.entity.Beverage;
import lab1.entity.ingredient.WhipCream;
import lab1.handler.NoSuchSizeException;

public class DecafCappuccino extends Decaf {
	private Beverage decafCappuccino;
	
	public DecafCappuccino() {
		decafCappuccino = new WhipCream(new Decaf());
		this.description = "Decaf Cappuccino";
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		decafCappuccino.setSize(size);
	}
	
	public double cost() {
		return decafCappuccino.cost();
	}
}
