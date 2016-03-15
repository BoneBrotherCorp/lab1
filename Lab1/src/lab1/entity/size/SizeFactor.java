package lab1.entity.size;

import lab1.handler.NoSuchSizeException;

public interface SizeFactor {
	public double sizeCost(String size) throws NoSuchSizeException;
}
