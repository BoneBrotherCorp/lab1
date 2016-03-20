package lab1.entity.tea;

import lab1.entity.Beverage;
import lab1.entity.ingredient.Ginger;
import lab1.handler.NoSuchSizeException;

public class GingerTea extends GreenTea {
	private Beverage gingerTea;
	
	public GingerTea() {
		gingerTea = new Ginger(new GreenTea());
		this.description = "Ginger Tea";
	}
	
	public void setSize(String size) throws NoSuchSizeException {
		gingerTea.setSize(size);
	}
	
	public double cost() {
		return gingerTea.cost();
	}
}
