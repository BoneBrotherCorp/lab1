package lab1.gui;

import javax.swing.*;

public class MainFrame extends JFrame {
	private LeftPanel lp= new LeftPanel();
	private RightPanel rp = new RightPanel();

	public MainFrame() {
		setLayout(null);
		add(lp);
		add(rp);
		lp.setBounds(0, 0, 300, 480);
		rp.setBounds(300, 0, 200, 480);
	}

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setTitle("Beverage Cost Helper");
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 480);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}