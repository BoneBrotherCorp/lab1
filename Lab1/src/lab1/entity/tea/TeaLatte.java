package lab1.entity.tea;

import lab1.entity.Beverage;
import lab1.entity.ingredient.Milk;
import lab1.handler.NoSuchSizeException;

public class TeaLatte extends RedTea {
	private Beverage teaLatte;
	
	public TeaLatte() {
		teaLatte = new Milk(new RedTea());
		this.description = "Tea Latte";
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		teaLatte.setSize(size);
	}
	
	public double cost() {
		return teaLatte.cost();
	}
}
