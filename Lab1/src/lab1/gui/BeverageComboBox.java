package lab1.gui;

import javax.swing.JComboBox;

public class BeverageComboBox extends JComboBox {
	public BeverageComboBox() {
		addItem("Decaf");
		addItem("Cappuccino");
		addItem("Decaf Cappuccino");
		addItem("Latte");
		addItem("Mocha");
		addItem("Decaf Latte");
		addItem("Decaf Mocha");
		addItem("Espresso");
		addItem("HouseBlend");
		addItem("Flower Tea");
		addItem("Ginger Tea");
		addItem("Green Tea");
		addItem("Red Tea");
		addItem("Tea Latte");
		addItem("White Tea");
		setSelectedItem("Espresso");
	}
}