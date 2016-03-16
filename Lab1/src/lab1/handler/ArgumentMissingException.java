package lab1.handler;

public class ArgumentMissingException extends Exception {
	/**
	 * Exception for empty argument input
	 */
	private static final long serialVersionUID = 1L;

	public void printMessage() {
		System.out.println("Please enter correct arguments and use \";\" to split orders. ");
		System.out.println("[<beverage number>] <beverage name> <size> [<ingredient1, ingredient2, ...>];...");
		System.out.println("There should be a space between \";\" and letters.");
	}
}
