package lab1.gui;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lab1.util.Parser;

public class RightPanel extends JPanel {
	private JPanel p = new JPanel();
	private JLabel l = new JLabel("total cost:");
	private JTextField tf = new JTextField(4);
	private JButton b0 = new JButton("remove");
	private JButton b1 = new JButton("calculate");
	static TextArea ta = new TextArea();

	public RightPanel() {
		setLayout(null);
		setSize(200, 480);
		ta.setBounds(0, 10, 170, 330);
		ta.setEditable(false);
		this.tf.setEditable(false);
		this.b0.setBounds(0, 360, 80, 20);
		this.b0.addActionListener(new action0());
		this.b1.setBounds(85, 360, 80, 20);
		this.b1.addActionListener(new action1());
		this.p.setBounds(0, 390, 200, 30);
		this.p.add(this.l);
		this.p.add(this.tf);
		add(ta);
		add(this.b0);
		add(this.b1);
		add(this.p);
	}

	private class action0 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			RightPanel.ta.setText("");
		}
	}

	private class action1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Parser parser = new Parser();
				String[] s = RightPanel.ta.getText().split(";\n");
				DecimalFormat df = new DecimalFormat(".0");
				double totalCost = 0;
				for (int i = 0; i < s.length; i++)
					totalCost += parser.parseOrderLists(s[i].split(" "));
				RightPanel.this.tf.setText("$" + df.format(totalCost));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "nothing to calculate!", "error", 0);
			}
		}
	}
}