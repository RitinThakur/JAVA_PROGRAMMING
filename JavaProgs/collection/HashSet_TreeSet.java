package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_TreeSet {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(10);
	hs.add(20);
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(30);
	hs.add(40);
	
	System.out.println(hs);
	TreeSet ts=new TreeSet(hs);
	System.out.println(ts);
}
}
