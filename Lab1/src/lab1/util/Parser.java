package lab1.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import lab1.entity.Beverage;
import lab1.entity.BeverageFactory;
import lab1.entity.BeverageWithIngredientFactory;
import lab1.handler.ArgumentMissingException;
import lab1.handler.NoSuchBeverageException;
import lab1.handler.NoSuchIngredientException;
import lab1.handler.NoSuchSizeException;
import lab1.handler.OrderNumException;

public class Parser {
	
	/**
	 * Parse a list of orders
	 * @param args
	 * @return the total cost of the orders
	 * @throws ArgumentEmptyException 
	 * @throws NoSuchSizeException 
	 * @throws NoSuchBeverageException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IndexOutOfBoundsException
	 * @throws NoSuchIngredientException 
	 * @throws InvocationTargetException 
	 * @throws NoSuchMethodException 
	 * @throws OrderNumException 
	 */
	public double parseOrderLists(String[] args) throws ArgumentMissingException, InstantiationException, IllegalAccessException, NoSuchBeverageException, NoSuchSizeException, IndexOutOfBoundsException, NoSuchMethodException, InvocationTargetException, NoSuchIngredientException, OrderNumException {
		double totalCost = 0;
		int orderNum;
		ArrayList<ArrayList<String>> orderList;
		
		//split the orders
		try {
			orderNum = Integer.parseInt(args[0]);
			orderList = splitOrder(args, orderNum);
		} catch (IndexOutOfBoundsException e) {
			throw new ArgumentMissingException();
		} catch (NumberFormatException e) {
			ArrayList<String> order = new ArrayList<String>();
			orderList = new ArrayList<ArrayList<String>>();
			for (int i = 0; i < args.length; i++)
				order.add(args[i]);
			orderList.add(order);
		}
		
		//parse the orders 
		for (int i = 0; i < orderList.size(); i++) {
			try {
				totalCost += parseOrder(orderList.get(i));
			} catch (IndexOutOfBoundsException e) {
				throw new ArgumentMissingException();
			}
		}
		return totalCost;
	}
	
	/**
	 * Split arguments into several order by ";"
	 * @param args
	 * @return an ArrayList of ArrayList<String>, each ArrayList<String> is an order
	 * @throws OrderNumException 
	 */
	public ArrayList<ArrayList<String>> splitOrder(String[] args, int orderNum) throws ArgumentMissingException, OrderNumException {
		ArrayList<ArrayList<String>> orderList = new ArrayList<ArrayList<String>>(orderNum);
		ArrayList<String> order = new ArrayList<String>();
		
		for (int i = 1; i < args.length; i++) {
			if (!args[i].equals(";")) {
				order.add(args[i]);
			}
			else {
				orderList.add(order);
				order.clear();
			}
		}
		orderList.add(order);
		if (orderList.size() == orderNum)
			return orderList;
		throw new OrderNumException(orderNum);
	}
	
	/**
	 * Parse one order
	 * @param order
	 * @return cost of the order
	 * @throws NoSuchBeverageException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NoSuchSizeException 
	 * @throws IndexOutOfBoundsException
	 * @throws NoSuchIngredientException 
	 * @throws InvocationTargetException 
	 * @throws NoSuchMethodException 
	 */
	public double parseOrder(ArrayList<String> order) throws InstantiationException, IllegalAccessException, NoSuchBeverageException, NoSuchSizeException, ArgumentMissingException, IndexOutOfBoundsException, NoSuchMethodException, InvocationTargetException, NoSuchIngredientException {
		int pos = 0;
		Beverage bev;
		BeverageFactory bevFactory = BeverageFactory.getFactory();
		BeverageWithIngredientFactory ingFactory = BeverageWithIngredientFactory.getFactory();
		
		//get beverage name
		//first parse two strings, if the beverage dosen't exist, then parse one string instead 
		String bevName = order.get(pos) + " " + order.get(pos + 1);
		try {
			bev = bevFactory.getBeverage(bevName);
			pos += 2;
		} catch (NoSuchBeverageException e) {
			bevName = order.get(pos);
			bev = bevFactory.getBeverage(bevName);
			pos++;
		}
		
		//get beverage size
		String size = order.get(pos);
		bev.setSize(size);
		
		//get ingredients
		for (pos++; pos < order.size(); pos++) {
			String ingredient = order.get(pos);
			bev = ingFactory.getBeverageWithIngredient(ingredient, bev);
		}
		return bev.cost();
	}
}
