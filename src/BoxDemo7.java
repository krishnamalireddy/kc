/*
 * Encapsulation is the mechanism that binds together code and the data it manipulates,
and keeps both safe from outside interference and misuse. One way to think about
encapsulation is as a protective wrapper that prevents the code and data from being
arbitrarily accessed by other code defined outside the wrapper
 * In Java the basis of encapsulation is the class.
 * A class
defines the structure and behavior (data and code) that will be shared by a set of objects

However,
encapsulation provides another important attribute: access control. Through
encapsulation, you can control what parts of a program can access the members of a
class. By controlling access, you can prevent misuse. For example, allowing access to
data only through a well-defined set of methods, you can prevent the misuse of that data.
Thus, when correctly implemented, a class creates a "black box" which may be used, but
the inner workings of which are not open to tampering.


Since encapsulation is a primary
attribute of OOP, it is not surprising that Java provides a solution to this problem.
Whenever a subclass needs to refer to its immediate superclass, it can do so by use of
the keyword super.
super has two general forms. The first calls the superclass' constructor. The second is
used to access a member of the superclass that has been hidden by a member of a
subclass.
 * The native modifier applies only to methods.
The strictfp modifier applies only to classes and methods.
Marking a class as strictfp means that any method code in the
class will conform to the IEEE754 standard rules for floating points. Without that
modifier, floating points used in the methods might behave in a platform-dependent
way. If you don’t declare a class as strictfp, you can still get strictfp
behavior on a method-by-method basis, by declaring a method as strictfp
 */


class Box11 {
	
	
	double width;
	double height;
	double depth;
	int something;
	
	transient int x;//ignore while object serialization
	
	volatile int bb;//a thread accesing the variable must reconsile it with mater copy
	
	double calvolume() {//function
		return width * height * depth;
	}
	
	double calboxdetail(int x)
	
	{
		return depth+x+height;
		
	}
	
   double calboxdetail(int x,int y)
	
	{
		return this.height+x+y;
		
	}

   double calboxdetail(int x,int y,int z)

  {
	return x+y+z;
	
  }



	// This is the constructor for Box.
	Box11(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	
	Box11(double w, double h) {
		width = w;
		height = h;
	
	}
	
	Box11() {
		
	
	}
	
	Box11(double w, double h, double d,int m) {
		width = w;
		height = h;
		depth = d;
		something=m;
	}


	// compute and return volume
	
}

class BoxDemo7 {
	public static void main(String args[]) {
		// declare, allocate, and initialize Box objects
		Box11 mybox1 = new Box11(10, 20, 30);//constructing objects
		
		//mybox1.depth=100;//access the variable of an object
		
		
		double dmmm=mybox1.calboxdetail(10);
	
		
		System.out.println(dmmm);
		
		/////////////////////////////////////
       //Box11 mybox2 = new Box11(20, 20, 20);//constructing objects
       
       //Box11 mybox3 = new Box11(10, 20, 20,9);//constructing objects
       
       //Box11 mybox4 = new Box11(10, 20);//constructing objects
       
       //Box11 mybox5 = new Box11();//constructing objects
		
		
		//double e=mybox2.calboxdetail(10);
		
		
		//System.out.println(e);
		//double c= mybox1.calboxdetail(10,1);
		
		//double g= mybox1.calboxdetail(10,1,2);
		
		
		//System.out.println(d);
		//System.out.println(c);
		//System.out.println(g);
		
	}
}
