package lab1.entity;

import lab1.entity.size.CoffeeBased;
import lab1.handler.NoSuchSizeException;


public abstract class CoffeeBeverage extends Beverage {
	private double sizeCost;
	
	public CoffeeBeverage() {
		super.sizeFactor = new CoffeeBased();
	}

	public void setSize(String size) throws NoSuchSizeException {
		sizeCost = super.sizeFactor.sizeCost(size);
	}

	public double cost() {
		return super.cost() + sizeCost;
	}
}
