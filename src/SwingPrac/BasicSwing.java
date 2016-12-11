package SwingPrac;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
public class BasicSwing extends JFrame
{
	JPanel p= new JPanel();
	JButton b= new JButton("Click");
	JTextField tf= new JTextField("HEllo",20);
	JTextArea ta= new JTextArea("Hi\nHello\nhi\n",3,10);
	JLabel l= new JLabel("Hello");
	String Options[]={"HI","Hello","Welcome"};
	JComboBox jc= new JComboBox(Options);
	
public static void main(String[] args) 
 {
		new BasicSwing();
	                        
	}
 public BasicSwing()
	{
		super("Basic Swing App");
		
		
		setSize(300,300);
		setResizable(true);
		
		
		p.add(b);
		p.add(ta);
		p.add(tf);
		p.add(l);
		p.add(jc);
		add(p);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

}
