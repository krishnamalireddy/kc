package REFLECTION;

class Simple{
	
	
	void message(){System.out.println("Hello Java");}
}



class Test{
  void printName(Object obj){
	  
	  
  Class c=obj.getClass();  
 
  
 
  }
  
  public static void main(String args[]) throws Exception{
   Simple s=new Simple();
  
   Object x=s;
 
   Test t=new Test();
   t.printName(x);
   
     

   
 }
}
 

