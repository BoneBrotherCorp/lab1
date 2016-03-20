package lab1.handler;

public class NoSuchIngredientException extends Exception {

	/**
	 * Exception for invalid ingredient input
	 */
	private static final long serialVersionUID = 1L;
	private String ingredient;
	
	public NoSuchIngredientException(String ingredient) {
		this.ingredient = ingredient;
	}
	
	public String getMessage() {
		return this.ingredient;
	}
	
	public void pirntMessage() {
		System.out.println("Invalid ingredient input: \"" + this.ingredient + "\"");
	}
}
