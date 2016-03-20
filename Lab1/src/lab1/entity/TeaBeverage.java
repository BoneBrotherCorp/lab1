package lab1.entity;

import lab1.entity.size.TeaBased;
import lab1.handler.NoSuchSizeException;


public abstract class TeaBeverage extends Beverage {
	private double sizeCost;

	public TeaBeverage() {
		super.sizeFactor = new TeaBased();
	}

	public void setSize(String size) throws NoSuchSizeException {
		this.sizeCost = super.sizeFactor.sizeCost(size);
	}

	public double cost() {
		return super.cost() + sizeCost;
	}
}
