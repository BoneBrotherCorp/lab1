package lab1.handler;

public class OrderNumException extends Exception {

	/**
	 * Exception for input order number does't match the fact
	 */
	private static final long serialVersionUID = 1L;
	private int orderNum;
	
	public OrderNumException(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public String getMessage() {
		return this.orderNum + "";
	}
	
	public void printMessage() {
		System.out.println("Input beverage number error: " + orderNum + ".\nPlease check the input beverage number.");
	}
	
}
