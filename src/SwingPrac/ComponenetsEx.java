package SwingPrac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComponenetsEx {
	JFrame f=new JFrame(); 
	void ComponenetsEx1()
	{
		//radio button
		
		JRadioButton rb1= new JRadioButton("Male");
		rb1.setBounds(50, 100, 70, 30);
		JRadioButton rb2= new JRadioButton("Female");
		rb2.setBounds(50, 150, 70, 30);
		rb1.setVisible(true);	
		rb2.setVisible(true);
		ButtonGroup bg=new ButtonGroup();  
		bg.add(rb1);
		bg.add(rb2);  
		
		f.add(rb1);
		f.add(rb2);
		
		//TextArea
		
		JTextArea ta= new JTextArea("Enter your comments here");
		ta.setBounds(5, 10, 10, 10);
		ta.setBackground(Color.cyan);
		f.add(ta);
		
	
		
		//button
		JButton b=new JButton("Click");
		b.setBounds(50, 200, 110, 80);
		f.add(b);
		
		f.setSize(800,800);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		
		ComponenetsEx obj= new ComponenetsEx();
		obj.ComponenetsEx1();

	}

}
