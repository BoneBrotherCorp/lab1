package lab1.gui;

import javax.swing.*;

public class mainFrame extends JFrame {
	private leftPanel lp= new leftPanel();
	private rightPanel rp = new rightPanel();

	public mainFrame() {
		setLayout(null);
		add(lp);
		add(rp);
		lp.setBounds(0, 0, 300, 480);
		rp.setBounds(300, 0, 200, 480);
	}

	public static void main(String[] args) {
		mainFrame frame = new mainFrame();
		frame.setTitle("baverage cost helper");
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 480);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
		frame.setResizable(false);
	}
}