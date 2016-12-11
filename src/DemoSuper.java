// A complete implementation of BoxWeight.
class Boxq {
	private double width;
	private double height;
	private double depth;
// constructor used when all dimensions specified
	Boxq(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

    // compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// BoxWeight now fully implements all constructors.
class BoxWeightw extends Boxq {
	double weight; // weight of box


// constructor when all parameters are specified
	BoxWeightw(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		weight = m;
	}


}

class DemoSuper {
	public static void main(String args[]) {
		BoxWeightw mybox1 = new BoxWeightw(10, 20, 15, 34.3);
		
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
	
		
	}

}