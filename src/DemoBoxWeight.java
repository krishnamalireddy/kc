// This program uses inheritance to extend Box.

/*A major advantage of inheritance is that once you have created a superclass that defines
the attributes common to a set of objects, it can be used to create any number of more
specific subclasses. Each subclass can precisely tailor its own classification
A reference variable of a superclass can be assigned a reference to any subclass derived
from that superclass
*/

class Boxx {
	double width;
	double height;
	double depth;

	// construct clone of an object
	Boxx(Boxx ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when all dimensions specified
	Boxx(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions specified
	Boxx() {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	}

	// constructor used when cube is created
	Boxx(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Here, Box is extended to include weight.
class BoxWeight extends Boxx {
	double weight; // weight of box
	// constructor for BoxWeight

BoxWeight(double w, double h, double d, double m) {
width = w;
height = h;

depth = d;
weight = m;
}
}

class DemoBoxWeight {
	public static void main(String args[]) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		
		//////////////////////////////
		
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Boxx plainbox = new Boxx();
		double voll;
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " +
		weightbox.weight);
		System.out.println();
		// assign BoxWeight reference to Box reference
		plainbox = weightbox;
		voll = plainbox.volume(); // OK, volume() defined in Box
		System.out.println("Volume of plainbox is " + voll);
		/* The following statement is invalid because plainbox
		does not define a weight member. */
		// System.out.println("Weight of plainbox is " +plainbox.weight);
		
		
		
	}
}

