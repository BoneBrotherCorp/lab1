package lab1;

public abstract class BeverageWithIngredient extends Beverage {
	private Beverage drink;


	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
		this.description = drink.getDescription();
	}
	
	public double cost() {
		return drink.cost();
	}
}
