package lab1;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		String[] disArr = new String[args.length];
		for (int j = 0; j < args.length; j++) {
			disArr[j] = args[j].toLowerCase();
		}

		int i;		
		for (i = 0; i < disArr.length; i++)
			if (disArr[i].equals("small") || disArr[i].equals("medium")
					|| disArr[i].equals("large") || disArr[i].equals("grand"))
				break;

		if (i >= disArr.length) {
			System.out.println("Must set a size!");
			return;
		}

		String beveStr;
		if (i == 2) {
			beveStr = disArr[0] + " " + disArr[1];
		} else {
			beveStr = disArr[0];
		}

		Beverage order;
		if (beveStr.equals("espresso")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("houseblend")) {
			order = new HouseBlend();
			((CoffeeBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("mocha")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Chocolate(order);
		} else if (beveStr.equals("latte")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
		} else if (beveStr.equals("cappuccino")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new WhipCream(order);
		}else if (beveStr.equals("decaf mocha")) {
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Chocolate(order);
		}else if (beveStr.equals("green tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("red tea")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("white tea")) {
			order = new WhiteTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("flower tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Jasmine(order);
		} else if (beveStr.equals("ginger tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Ginger(order);
		} else if (beveStr.equals("tea latte")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
		} else {
			System.out.println("Illegal input: " + beveStr);
			return;
		}

		for (i++; i < disArr.length; i++) {
			if (disArr[i].equals("chocolate")) {
				order = new Chocolate(order);
			} else if (disArr[i].equals("ginger")) {
				order = new Ginger(order);
			} else if (disArr[i].equals("milk")) {
				order = new Milk(order);
			} else if (disArr[i].equals("jasmine")) {
				order = new Jasmine(order);
			} else if (disArr[i].equals("whip")) {
				order = new WhipCream(order);
			} else {
				System.out.println("Illegal input: " + disArr[i]);
			}
		}

		/**
		 * How do I get the description of each order instead of doing this
		 * stupid thing forever (except for printing the args)?
		 */
		
		/*
		 * After adding an abstact method to the Beverage class and changing 
		 * the constructor of BeverageWithIngredient class, we don't have to 
		 * check the data type each time we using getDescription.
		 */
		order.getDescription();

		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "
				+ df.format(order.cost()));
	}
}