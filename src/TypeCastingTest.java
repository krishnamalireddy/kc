
/*�
 * Assigning a value of one type to a variable of another type is known as Type Casting
 * Widening Casting(Implicit)

widening-type-conversion

byte short int double --->
<----
�Narrowing Casting(Explicitly done)

*/

class Animal1 {
int health = 100;
}

class Mammal extends Animal1 { }

class Cat extends Mammal { }

class Dog extends Mammal { }



public class TypeCastingTest {
	
	public static void main(String[] args)
    {
      int i = 100;	
      long l = i;	//no explicit type casting required  
      float f = l;	//no explicit type casting required  
      System.out.println("Int value "+i);
      System.out.println("Long value "+l);
      System.out.println("Float value "+f);
      
      
      
      ////
      double d = 100.04;  
      long l1 = (long)d;  //explicit type casting required  
      int i1 = (int)l;	//explicit type casting required  
      
      System.out.println("Double value "+d);
      System.out.println("Long value "+l1);
      System.out.println("Int value "+i1);
      
      
      Cat c = new Cat();
      System.out.println(c);
      Mammal m = c; // upcasting
      System.out.println(m);

      Cat c1 = new Cat();
      Animal1 a = c1; //upcasting to Animal
   
      if(a instanceof Cat)
      { // testing if the Animal is a Cat
      System.out.println("It's a Cat! Now i can safely downcast it to a Cat, without a fear of failure.");
      @SuppressWarnings("unused")
	Cat c2 = (Cat)a ;//down casting
      }
     
      
      /*
       * Why is that so, that upcasting is automatical, but downcasting must be manual? 
       * upcasting can never fail. But if you have a group of different 
       * Animals and want to downcast them all to a Cat, 
       * then there's a chance, that some of these Animals are actually Dogs,
       *  and process fails, by throwing ClassCastException.
       */
       

    }


}
