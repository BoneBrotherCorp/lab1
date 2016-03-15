package lab1.entity.size;

import java.util.HashMap;
import java.util.Map;

import lab1.handler.NoSuchSizeException;

public class TeaBased implements SizeFactor {
	private Map<String, Double> costMap;
	
	public TeaBased() {
		costMap = new HashMap<String, Double>();	
		costMap.put("small", 0.2);
		costMap.put("medium", 0.5);
		costMap.put("large", 0.7);
		costMap.put("grand", 0.9);
	}

	@Override
	public double sizeCost(String size) throws NoSuchSizeException {
		if (costMap.containsKey(size))
			return costMap.get(size);
		throw new NoSuchSizeException(size);
	}
}
