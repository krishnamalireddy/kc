package FILEHANDLING;

//ObjectInputStream is responsible for reading objects from a
//stream. The constructor of this class is
/*
 * A FileOutputStream is created that refers to a file named "serial," and an
ObjectOutputStream is created for that file stream. The writeObject( ) method of
ObjectOutputStream is then used to serialize our object. The object output stream is
flushed and closed.
A FileInputStream is then created that refers to the file named "serial," and an
ObjectInputStream is created for that file stream. The readObject( ) method of
ObjectInputStream is then used to deserialize our object. The object input stream is
then closed.
Note that MyClass is
Serializable

Only an object that implements the Serializable interface can be saved and restored by
the serialization facilities. The Serializable interface defines no members. It is simply
used to indicate that a class may be serialized. If a class is serializable, all of its
subclasses are also serializable.
Variables that are declared as transient are not saved by the serialization facilities. Also,
static variables are not saved.

Externalizable
The Java facilities for serialization and deserialization have been designed so that much
of the work to save and restore the state of an object occurs automatically. However,
there are cases in which the programmer may need to have control over these
processes. For example, it may be desirable to use compression or encryption
techniques. The Externalizable interface is designed for these situations.
The Externalizable interface defines these two methods:
void readExternal(ObjectInput inStream)
throws IOException, ClassNotFoundException
void writeExternal(ObjectOutput outStream)
throws IOException
In these methods, inStream is the byte stream from which the object is to be read, and
outStream is the byte stream to which the object is to be written.
 * */
 

import java.io.*;

public class SerializationDemo {
	public static void main(String args[]) {
		// Object serialization
		try {
			MyClass object1 = new MyClass("Hello", -7, 2.7e10);
			System.out.println("object1: " + object1);
			FileOutputStream fos = new FileOutputStream("serial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println("Exception during serialization: " + e);
			System.exit(0);
		}
		// Object deserialization
		try {
			MyClass object2;
			FileInputStream fis = new FileInputStream("serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object2 = (MyClass) ois.readObject();
			ois.close();
			System.out.println("object2: " + object2);
		} catch (Exception e) {
			System.out.println("Exception during deserialization: " + e);
			System.exit(0);
		}
	}

}

class MyClass implements Serializable {
	String s;
	int i;
	double d;

	public MyClass(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}

	public String toString() {
		return "s=" + s + "; i=" + i + "; d=" + d;
	}
}