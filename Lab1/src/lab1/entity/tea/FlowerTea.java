package lab1.entity.tea;

import lab1.entity.Beverage;
import lab1.entity.ingredient.Jasmine;
import lab1.handler.NoSuchSizeException;

public class FlowerTea extends GreenTea {
	private Beverage flowerTea;
	
	public FlowerTea() {
		flowerTea = new Jasmine(new GreenTea());
		this.description = "Flower Tea";
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		flowerTea.setSize(size);
	}
	
	public double cost() {
		return flowerTea.cost();
	}
}
