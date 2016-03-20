package lab1.util;

import java.text.DecimalFormat;

import lab1.handler.ArgumentMissingException;
import lab1.handler.NoSuchBeverageException;
import lab1.handler.NoSuchIngredientException;
import lab1.handler.NoSuchSizeException;
import lab1.handler.OrderNumException;

public class Main {
	public static void main(String[] args) {
		Parser parser = new Parser();
		try {
			double totalCost = parser.parseOrderLists(args);
			DecimalFormat df = new DecimalFormat(".0");
			System.out.println("The total cost of your order is: " + df.format(totalCost));
		} catch (ArgumentMissingException ame) {
			ame.printMessage();
		} catch (OrderNumException one) {
			one.printMessage();
		} catch (NoSuchBeverageException nbe) {
			nbe.printMessage();
		} catch (NoSuchSizeException nse) {
			nse.printMessage();
		} catch (NoSuchIngredientException nie) {
			nie.pirntMessage();
		} catch (Exception e) {
			System.out.println("Unkwow exception occurs.");
			e.printStackTrace();
		}
	}
}