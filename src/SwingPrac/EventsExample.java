package SwingPrac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;




public class EventsExample extends JFrame implements ActionListener{
	

String  fname, lname ;
	
	JPanel p= new JPanel();
	JLabel label1 = new JLabel("First Name:");
	JTextField tf1=new JTextField("",10);
	JLabel label2 = new JLabel("Last Name:");
	JTextField tf2=new JTextField(" ",10);
	JButton jb=new JButton("Submit");
	
public EventsExample()
{   
	super("Swingapp");
	
	setSize(500, 500);
	
	
	p.add(label1);	
	p.add(tf1);
	p.add(label2);
	p.add(tf2);
	p.add(jb);
	
	jb.addActionListener(this);	
	this.add(p);
			
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
public void actionPerformed(ActionEvent e)

{   
	
	
JOptionPane.showMessageDialog(this, tf1.getText() + tf2.getText());
   
String firstName=tf1.getText();
String SecondName=tf2.getText();
jdbcconnect obj= new jdbcconnect();
obj.connect(firstName,SecondName);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
    
 
	};
	public static void main(String[] args) 
	{
		new EventsExample();
	
		

	}	

}

class jdbcconnect
{
	void  connect(String fn,String sn)
	  {
		String fname=fn;
		  String sname=sn;
		  //System.out.println(fname+","+sname);
		Connection con=null;
		   Statement stmnt=null;
		   PreparedStatement statement = null;
		  
		   
		   try
		   {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
				
				System.out.println("Connecting to a selected database...");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sunitta", "sunitta");
				System.out.println("Connected database successfully...");
				
				System.out.println("Creating table in given database...");
				/*stmnt = con.createStatement();

				String sql = "CREATE TABLE Name " + "( u_fname VARCHAR(255), "
						+ " u_lname VARCHAR(255))";
				stmnt.executeUpdate(sql);
				System.out.println("Created table in given database...");*/
				System.out.println("Inserting records into the table...");
				//stmnt = con.createStatement();
				
				String sql = "INSERT INTO Name (u_fname,u_lname)"+"VALUES"
                        +"(?,?)";
				statement = con.prepareStatement(sql);
				statement.setString(1, fname);
				statement.setString(2, sname);
				statement.executeUpdate();
				//System.out.println(sql);
				

			}
						 				
		   
		   catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			}
		   catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
				}
		  
		   finally
		   {
			   try{
				   if(stmnt!=null)
				   
					   con.close();
			   }
				   catch (SQLException se){}
			   try{
				   if(con!=null)
					   con.close();
				   
			   }catch(SQLException se)
			   {
			   se.printStackTrace();
		        }
		   
	  }System.out.println("Goodbye!");
	  
}}

