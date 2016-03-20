package lab1.entity;

import lab1.entity.size.SizeFactor;
import lab1.handler.NoSuchSizeException;


public abstract class Beverage {
	protected SizeFactor sizeFactor;
	protected String description;
	
	public double cost() {
		return 0;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract void setSize(String size) throws NoSuchSizeException;
}
