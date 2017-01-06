package Jdbc;




//STEP 1. Import required packages
import java.sql.*;

public class JdbcConnect {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
 static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

 //  Database credentials
 static final String USER = "krishna";
 static final String PASS = "oracle";
 
 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName("oracle.jdbc.driver.OracleDriver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = conn.createStatement();
  
    
   
    
    
    String sql = "INSERT INTO emp1 " +
                 "VALUES (5, 'kc',80000)";
    
    ResultSet rs = stmt.executeQuery(sql);

    //STEP 5: Extract data from result set
    /*while(rs.next()){
       //Retrieve by column name
       int idnumber  = rs.getInt("idnumber");

       String f_name = rs.getString("f_name");
       String L_name = rs.getString("l_name");
		
		String city=rs.getString("city");
		
	       int salary = rs.getInt("salary");
       

       //Display values
       System.out.print("IDnumber: " + idnumber);
     
       System.out.print(", First: " + f_name);
       System.out.print(", Last: " + L_name);
       System.out.print(", city: " + city);

       
       System.out.println(", salary: " + salary);
       
        }*/
    //STEP 6: Clean-up environment
    rs.close();
    stmt.close();
    conn.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
}//end main
}//end FirstExample