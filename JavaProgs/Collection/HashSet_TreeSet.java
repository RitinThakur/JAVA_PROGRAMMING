package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_TreeSet {
	public static void main(String[] args) {

		// Step 1: Create a HashSet and add values
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(10);  // Duplicate, will not be added
		hs.add(20);  // Duplicate, will not be added
		hs.add(30);
		hs.add(40);
		hs.add(30);  // Duplicate
		hs.add(40);  // Duplicate

		// Step 2: Print HashSet
		System.out.println("HashSet (duplicates removed, no order guaranteed):");
		System.out.println(hs);

		// Step 3: Convert HashSet to TreeSet to sort elements
		TreeSet ts = new TreeSet(hs);

		// Step 4: Print TreeSet
		System.out.println("TreeSet (elements sorted in ascending order):");
		System.out.println(ts);
	}
}
