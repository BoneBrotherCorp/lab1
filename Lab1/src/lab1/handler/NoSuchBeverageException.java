package lab1.handler;

public class NoSuchBeverageException extends Exception {

	/**
	 * Exception for invalid beverage input
	 */
	private static final long serialVersionUID = 1L;
	private String bevInput;
	
	public NoSuchBeverageException(String bevInput) {
		super();
		this.bevInput = bevInput;
	}
	
	public String getBevInput() {
		return this.bevInput;
	}
	
	public void printMessage() {
		System.out.println("Invalid beverage input: \"" + this.bevInput + "\"");
	}
}
