package lab1.entity.size;

import java.util.HashMap;
import java.util.Map;

import lab1.handler.NoSuchSizeException;

public class CoffeeBased implements SizeFactor {
	private Map<String, Double> costMap;
	
	public CoffeeBased() {
		costMap = new HashMap<String, Double>();	
		costMap.put("small", 0.4);
		costMap.put("medium", 0.7);
		costMap.put("large", 1.0);
		costMap.put("grand", 1.3);
	}

	@Override
	public double sizeCost(String size) throws NoSuchSizeException {
		if (costMap.containsKey(size))
			return costMap.get(size);
		throw new NoSuchSizeException(size);
	}
}
