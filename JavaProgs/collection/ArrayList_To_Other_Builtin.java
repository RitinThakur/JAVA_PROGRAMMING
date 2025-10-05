package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayList_To_Other_Builtin {

	public static void main(String[] args) {

		// Step 1: Create an ArrayList and add elements (including duplicates)
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);
		al.add(40);

		// Print ArrayList
		// ArrayList allows duplicates and preserves insertion order
		System.out.println("ArrayList: " + al);

		// Step 2: Convert ArrayList to HashSet
		// HashSet does not allow duplicates and does not guarantee order
		HashSet hs = new HashSet(al);
		System.out.println("HashSet: " + hs);

		// Step 3: Convert ArrayList to TreeSet
		// TreeSet does not allow duplicates and stores elements in ascending order
		TreeSet ts = new TreeSet(al);
		System.out.println("TreeSet: " + ts);
	}
}
