package lab1.gui;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class leftPanel extends JPanel {
	private JPanel p0 = new JPanel();
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JPanel p4 = new JPanel();
	private JPanel p5 = new JPanel();
	private JPanel p6 = new JPanel();
	private JPanel p7 = new JPanel();
	private JLabel l0 = new JLabel("number:");
	private JLabel l1 = new JLabel("baverage:");
	private JLabel l2 = new JLabel("size:");
	private JLabel l3 = new JLabel("Chocolate:");
	private JLabel l4 = new JLabel("Ginger:");
	private JLabel l5 = new JLabel("Jasimine:");
	private JLabel l6 = new JLabel("Milk:");
	private JLabel l7 = new JLabel("WhipCream:");
	private JTextField tf = new JTextField(5);
	private JButton b = new JButton("add");
	private baverage cb1 = new baverage();
	private size cb2 = new size();
	private comboNumber cb3 = new comboNumber();
	private comboNumber cb4 = new comboNumber();
	private comboNumber cb5 = new comboNumber();
	private comboNumber cb6 = new comboNumber();
	private comboNumber cb7 = new comboNumber();

	public leftPanel() {
		setLayout(null);
		setSize(300, 480);
		p0.add(l0);
		p0.add(tf);
		p1.add(l1);
		p1.add(cb1);
		p2.add(l2);
		p2.add(cb2);
		p3.add(l3);
		p3.add(cb3);
		p4.add(l4);
		p4.add(cb4);
		p5.add(l5);
		p5.add(cb5);
		p6.add(l6);
		p6.add(cb6);
		p7.add(l7);
		p7.add(cb7);
		p0.setBounds(0, 0, 300, 50);
		p1.setBounds(0, 50, 300, 50);
		p2.setBounds(0, 100, 300, 50);
		p3.setBounds(0, 150, 300, 50);
		p4.setBounds(0, 200, 300, 50);
		p5.setBounds(0, 250, 300, 50);
		p6.setBounds(0, 300, 300, 50);
		p7.setBounds(0, 350, 300, 50);
		b.setBounds(100, 400, 80, 20);
		b.addActionListener(new action());
		add(p0);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(b);
	}

	private class action implements ActionListener {
		int n=-1;

		private action() {
		}

		public void actionPerformed(ActionEvent e) {
			try {
				if ((n = Integer.parseInt(tf.getText())) < 1) {
					JOptionPane.showMessageDialog(null, "your input is wrong!", "error", 0);
				} else {
					String s1 = (String) cb1.getSelectedItem();
					String s2 = (String) cb2.getSelectedItem();
					int s3 = Integer.parseInt((String) cb3.getSelectedItem());
					int s4 = Integer.parseInt((String) cb4.getSelectedItem());
					int s5 = Integer.parseInt((String) cb5.getSelectedItem());
					int s6 = Integer.parseInt((String) cb6.getSelectedItem());
					int s7 = Integer.parseInt((String) cb7.getSelectedItem());
					String s = n + " " + s1 + " " + s2 + " ";
					for (int i = 0; i < s3; i++)
						s = s + "Chocolate ";
					for (int i = 0; i < s4; i++)
						s = s + "Ginger ";
					for (int i = 0; i < s5; i++)
						s = s + "Jasmine ";
					for (int i = 0; i < s6; i++)
						s = s + "Milk ";
					for (int i = 0; i < s7; i++)
						s = s + "WhipCream ";
					s = s + ";\n";
					rightPanel.ta.append(s);
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "your input is wrong!", "error", 0);
			}
		}
	}
}