package ANNOTATION;

 class MySuperClass {

    public void doTheThing() {
        System.out.println("Do the thing");
    }
    
   

}


public class MySubClass extends MySuperClass{

    @Override
    public void doTheThing() {
        System.out.println("Do it differently");
    }
}

//@Deprecated
//public class MyComponent {

//}


