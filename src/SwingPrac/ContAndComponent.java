package SwingPrac;
import javax.swing.*;
import java.awt.*;
public class ContAndComponent {
JWindow w;//just for creating a window,which doent have,minimize or close buttons.
JFrame f;//frame is same like window but it has ,minimize and close buttons.
JPanel p;//Panel andframes are same,panel u can use for seperating frames in to parts.
void display()
{
	f= new JFrame();
	f.setVisible(true);
	f.setSize(500,500);
	
	w= new JWindow();
	w.setVisible(true);
	
	w.setSize(300,300);
	
	p=new JPanel();
	p.setVisible(true);
	
	p.setSize(300,300);

	}

	public static void main(String[] args) {
		ContAndComponent obj1=new ContAndComponent();
		obj1.display();

	}

}




