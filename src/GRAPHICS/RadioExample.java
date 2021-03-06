package GRAPHICS;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
class RadioExample extends JFrame implements ActionListener {
	JRadioButton rb1, rb2;
	JButton b;

	RadioExample() {

		rb1 = new JRadioButton("Male");
		rb1.setBounds(100, 100, 100, 30);

		rb2 = new JRadioButton("Female");
		rb2.setBounds(100, 50, 100, 30);

		//ButtonGroup bg = new ButtonGroup();
		//bg.add(rb1);
		//bg.add(rb2);

		b = new JButton("click");
		b.setBounds(100, 150, 80, 30);
		b.addActionListener(this);

		this.add(rb1);
		this.add(rb2);
		this.add(b);
		
		

		setSize(300, 300);
		this.setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are male");
		}
		if (rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are female");
		}
	}

	public static void main(String args[]) {
		new RadioExample();
	}
}
