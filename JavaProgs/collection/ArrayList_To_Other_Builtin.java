package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayList_To_Other_Builtin {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);
		al.add(40);
		System.out.println(al);

		HashSet hs=new HashSet(al);
		System.out.println(hs);

		TreeSet ts=new TreeSet(al);
		System.out.println(ts);
	}
}
