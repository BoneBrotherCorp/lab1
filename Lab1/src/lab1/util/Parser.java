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
	 */
	public double parseOrderLists(String[] args) throws ArgumentMissingException, InstantiationException, IllegalAccessException, NoSuchBeverageException, NoSuchSizeException, IndexOutOfBoundsException, NoSuchMethodException, InvocationTargetException, NoSuchIngredientException {
		double totalCost = 0;
		ArrayList<ArrayList<String>> orderList = splitOrder(args);
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
	 */
	public ArrayList<ArrayList<String>> splitOrder(String[] args) throws ArgumentMissingException {
		if (args.length == 0)
			throw new ArgumentMissingException();
		ArrayList<ArrayList<String>> orderList = new ArrayList<ArrayList<String>>();
		ArrayList<String> order = new ArrayList<String>();
		
		for (int i = 0; i < args.length; i++) {
			order.add(args[i]);
			
			if (args[i].contains(";")) {
				//if there is a space on both side of ";"
				if (args[i].equals(";")) {
					order.remove(args[i]);
				}
				//if there is no space on some side of ";"
				else {
					int splitIndex = args[i].indexOf(';');
					String arg = args[i].substring(0, splitIndex);
					if(arg.length()>0){
						//something before ;
						order.remove(args[i]);
						order.add(arg);
					}
					
					arg = args[i].substring(splitIndex+1, args[i].length());
					if(arg.length()>0){
						//something after ;
						order.remove(args[i]);
						args[i] = arg;
						i--;
					}
				}
				orderList.add(order);
				order = new ArrayList<String>();
			}
		}
		orderList.add(order);
		return orderList;
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
		int num = 0;
		int pos = 0;
		Beverage bev;
		BeverageFactory bevFactory = BeverageFactory.getFactory();
		BeverageWithIngredientFactory ingFactory = BeverageWithIngredientFactory.getFactory();
		
		//get beverage number
		try {
			num = Integer.parseInt(order.get(0));
			pos = 1;
		} catch (NumberFormatException e) {
			num = 1;
		}
		
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
		return bev.cost() * num;
	}
}
