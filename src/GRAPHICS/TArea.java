package GRAPHICS;

import javax.swing.*;

public class TArea {
	
	
    JTextArea area;
    JFrame f;
    
    
	TArea(){//creating an object of Tarea
	f=new JFrame();
		
	area=new JTextArea(300,300);
	area.setBounds(10,30,300,300);
	
	//area.setBackground(Color.white);
	//area.setForeground(Color.white);
		
	f.add(area);
	
	f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
     }
	
	
	
	public static void main(String[] args) {
		new TArea();
	}
}



