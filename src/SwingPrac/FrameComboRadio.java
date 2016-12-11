package SwingPrac;
import javax.swing.*;

public class FrameComboRadio {
	 
	 JFrame f = new JFrame();
	
void Radio()
	{
	
	JRadioButton r1 = new JRadioButton("Male");
	JRadioButton r2 = new JRadioButton("Female");
	r1.setBounds(150, 180, 70, 30);
	r2.setBounds(150, 200, 70, 30);
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(r1);
	bg.add(r2);

	f.add(r1);
	f.add(r2);

	f.setSize(500, 500);
	f.setLayout(null);
	f.setVisible(true);
	
	}
void Combo() {
	

	String country[] = { "India", "Aus", "U.S.A", "England", "Newzeland" };

	JComboBox cb = new JComboBox(country);
	cb.setBounds(50, 50, 50, 50);
	f.add(cb);

	//f.setLayout(null);
	f.setSize(200, 200);
	f.setVisible(true);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameComboRadio obj1= new FrameComboRadio();
		FrameComboRadio obj2= new FrameComboRadio();
		obj1.Radio();
		obj2.Combo();
		

	}

}
