package lab1.entity;

import java.util.HashMap;

import lab1.entity.coffee.*;
import lab1.entity.tea.*;
import lab1.handler.NoSuchBeverageException;

public class BeverageFactory {
	private static BeverageFactory factory;
	private HashMap<String, Class<? extends Beverage>> bevMap;
	
	private BeverageFactory() {
		bevMap = new HashMap<String, Class<? extends Beverage>>(); 
		bevMap.put("espresso", Espresso.class);
		bevMap.put("decaf", Decaf.class);
		bevMap.put("houseblend", HouseBlend.class);
		bevMap.put("mocha", Mocha.class);
		bevMap.put("latte", Latte.class);
		bevMap.put("cappuccino", Cappuccino.class);
		bevMap.put("decaf mocha", DecafMocha.class);
		bevMap.put("decaf latte", DecafLatte.class);
		bevMap.put("decaf cappuccino", DecafCappuccino.class);
		bevMap.put("green tea", GreenTea.class);
		bevMap.put("red tea", RedTea.class);
		bevMap.put("white tea", WhiteTea.class);
		bevMap.put("flower tea", FlowerTea.class);
		bevMap.put("ginger tea", GingerTea.class);
		bevMap.put("tea latte", TeaLatte.class);
	}
	
	public static BeverageFactory getFactory() {
		if (factory == null) {
			factory = new BeverageFactory();
		}
		return factory;
	}
	
	public Beverage getBeverage(String bevName) throws InstantiationException, IllegalAccessException, NoSuchBeverageException {
		bevName = bevName.toLowerCase();
		if (bevMap.containsKey(bevName)) {
			Beverage bev = bevMap.get(bevName).newInstance();
			return bev;
		}
		throw new NoSuchBeverageException(bevName);
	}
}
