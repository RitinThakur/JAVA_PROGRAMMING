package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_Elements_of_Int_Collection {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Number of elements to be added: ");
		int n=p.nextInt();

		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+ " value: ");
			al.add(p.nextInt());
		}
		System.out.println();
		System.out.print("Before sorting: ");
		System.out.println(al);

		Collections.sort(al);
		System.out.print("After Sorting:  ");
		System.out.println(al);
	}
}
