package lab1;

public abstract class Beverage {
	protected SizeFactor sizeFactor;
	protected String description;

	public double cost() {
		return 0;
	}
	
	public String getDescription(){
		return description;
	}
}
