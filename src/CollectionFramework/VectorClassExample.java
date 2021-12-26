package CollectionFramework;

import java.util.Vector;

public class VectorClassExample {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>();
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		// Adding elements using addElements() mehtod of Vector
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		
		System.out.println("Elements are: "+vec);
	}
}
