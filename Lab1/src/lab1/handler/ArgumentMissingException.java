package lab1.handler;

public class ArgumentMissingException extends Exception {
	/**
	 * Exception for empty argument input
	 */
	private static final long serialVersionUID = 1L;
	
	public void printMessage() {
		System.out.println("Please enter correct arguments with the following input patterns:");
		System.out.println("<beverage number> <beverage name> <size> [<ingredient1, ingredient2, ...>]; <beverage name> <size> [<ingredient1, ingredient2, ...>]");
		System.out.println("or just\n <beverage name> <size> [<ingredient1, ingredient2, ...>]");
		System.out.println("Caution: There should be a space between \";\" and other letters. \";\" shouldn't appear in the end of the instructions.");
	}
}
