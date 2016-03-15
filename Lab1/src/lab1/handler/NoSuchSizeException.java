package lab1.handler;

public class NoSuchSizeException extends Exception {
	/**
	 * Exception for invalid size input
	 */
	private static final long serialVersionUID = 1L;
	private String inputSize
	;
	public NoSuchSizeException(String size) {
		super();
		this.inputSize = size;
	}
	
	public String getInputSize() {
		return this.inputSize;
	}
	
	public void printMessage() {
		System.out.println("Invalid input size: " + inputSize);
	}
}
