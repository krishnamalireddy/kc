package SwingPrac;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class UserDetails extends JFrame {
JPanel Panel1=new JPanel();
JLabel Main=new JLabel("USER DETAILS",JLabel.CENTER);
JLabel name=new JLabel("Enter your name:",JLabel.RIGHT);
JLabel lang=new JLabel("Enter prefered language:",JLabel.RIGHT);
JLabel Gender=new JLabel("Enter Gender:",JLabel.RIGHT);
JLabel Comments=new JLabel("Enter Comments:",JLabel.RIGHT);
JTextArea Comm=new JTextArea(" ",3,10);
JTextField namT= new JTextField("",10);
String langList[]= {"LANGUAGE","English","Hindi","Kannada","Tamil","Telugu"};
JComboBox langT= new JComboBox(langList);
JRadioButton rb1=new JRadioButton("Male");
JRadioButton rb2=new JRadioButton("Female");
//ButtonGroup bg=new ButtonGroup();
JButton submit=new JButton("Submit");


	
	public static void main(String[] args) {
		new UserDetails();
		
	}
	
	public UserDetails()
	{
		super("User Details");
		setSize(400, 600);
		Main.setFont(new java.awt.Font("Bookman Old Style", 1, 16));
		
		
		Panel1.add(Main);
		Panel1.add(name);
		Panel1.add(namT);
		Panel1.add(lang);
		Panel1.add(langT);
		Panel1.add(Gender);
		Panel1.add(rb1);
		Panel1.add(rb2);
		Panel1.add(Comments);
		Panel1.add(Comm);
		Panel1.add(submit);
		//submit.addActionListener(new ActionListener()
	/*	
			{
		         public void actionPerformed(ActionEvent e) {     
		            String data1 = "Name: " + namT.getText();
		         String  data2 = ", Language: " 
		            + (langT.getToolTipText()); 
		         String data3 = "Gender: " + namT.getText();
		         String  data4 = ", Comments: " 
		            + (Comm.getText());
		            
		         JOptionPane.showMessageDialog(this, namT.getText() + langT.getToolTipText()+Comm.getText());
		            String name=namT.getText();
		            String langu=langT.getToolTipText();
		            if (rb1.isSelected()) {
		    			JOptionPane.showMessageDialog(this, "You are male");
		    		}
		    		if (rb2.isSelected()) {
		    			JOptionPane.showMessageDialog(this, "You are female");
		    			
		    		}
		            
		            
		            jdbcconnect obj= new jdbcconnect();
		            obj.connect(name,langu);
		            statusLabel.setText(data);        
		         }
		       
		});*/
		this.add(Panel1);
		/*bg.add(rb1);
		bg.add(rb2);
		Panel1.add(bg);*/
		add(Panel1);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

}
