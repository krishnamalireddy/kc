package Autoboxing;

//Autoboxing and Unboxing
//•Autoboxing and Unboxing features was added in Java5
//Autoboxing is a process by which primitive type is automatically encapsulated(boxed) into its equivalent type wrapper
//Auto-Unboxing is a process by which the value of object is automatically extracted from a type wrapper
class BoxingExample1{  
 public static void main(String args[]){  
    int a=50;  
        Integer a2=new Integer(a);//Boxing  
  
        Integer a3=5;//autoBoxing  
          
        System.out.println(a2+" "+a3);  
 }   
}  

