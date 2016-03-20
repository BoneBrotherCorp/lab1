package lab1.entity;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import lab1.entity.ingredient.*;
import lab1.handler.NoSuchIngredientException;

public class BeverageWithIngredientFactory {
	private static BeverageWithIngredientFactory factory;
	private HashMap<String, Class<? extends BeverageWithIngredient>> ingredientMap;
	
	private BeverageWithIngredientFactory() {
		ingredientMap = new HashMap<String, Class<? extends BeverageWithIngredient>>();
		ingredientMap.put("ginger", Ginger.class);
		ingredientMap.put("milk", Milk.class);
		ingredientMap.put("jasmine", Jasmine.class);
		ingredientMap.put("whipcream", WhipCream.class);
		ingredientMap.put("chocolate", Chocolate.class);
	}
	
	public static BeverageWithIngredientFactory getFactory() {
		if (factory == null) {
			factory = new BeverageWithIngredientFactory();
		}
		return factory;
	}
	
	public BeverageWithIngredient getBeverageWithIngredient(String ingredient, Beverage beverage) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchIngredientException {
		String ingredientName = ingredient.toLowerCase();
		if (ingredientMap.containsKey(ingredientName)) {
			return ingredientMap.get(ingredientName).getConstructor(Beverage.class).newInstance(beverage);
		}
		throw new NoSuchIngredientException(ingredient);
	}
}
