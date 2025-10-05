package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayList_To_Other_Manual {

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

		// Step 2: Convert ArrayList to HashSet manually
		// HashSet removes duplicates and does not maintain order
		HashSet hs = new HashSet();
		for (Object o : al) {
			hs.add(o); // add each element from ArrayList to HashSet
		}
		System.out.println("HashSet (manual conversion): " + hs);

		// Step 3: Convert ArrayList to TreeSet manually
		// TreeSet removes duplicates and stores elements in ascending order
		TreeSet ts = new TreeSet();
		for (Object o : al) {
			ts.add(o); // add each element from ArrayList to TreeSet
		}
		System.out.println("TreeSet (manual conversion): " + ts);
	}
}
