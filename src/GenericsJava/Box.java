package GenericsJava;

//Java Generic methods and generic classes enable programmers to specify, 
//with a single method declaration, a set of related methods or, with a single class declaration, a set of related types, respectively.

//Generics also provide compile-time type safety that allows programmers to
//catch invalid types at compile time.


//Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. 
//The good programming strategy says it is far better to handle the problem at compile time than runtime


//There are mainly 3 advantages of generics. They are as follows:

//1) Type-safety : We can hold only a single type of objects in generics. It doesn’t allow to store other objects.

//2) Type casting is not required: There is no need to typecast the object.



public class Box<T> {

	  private T x;

	  public void add(T t) {
	    this.x = t;
	  }

	  public T get() {
	    return x;
	  }

	  public static void main(String[] args) {
	     Box<Integer> xxxxxBox = new Box<Integer>();
	     Box<String> stringBox = new Box<String>();
	    
	     xxxxxBox.add(new Integer(10));
	     stringBox.add(new String("Hello World"));

	     System.out.println( xxxxxBox.get());
	     System.out.println("String Value"+ stringBox.get());
	  }
	}

