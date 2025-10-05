package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Laptop_Driver {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		ArrayList<Laptop> al=new ArrayList<Laptop>();
		System.out.print("Enter Number of Laptops to be Entered: ");
		int n=p.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("For "+ (i+1)+ " Laptop");
			System.out.print("Enter Laptop id: ");
			int id=p.nextInt();
			System.out.print("Enter Laptop Brand: ");
			String brand=p.next();
			System.out.print("Enter Laptop Price: ");
			double price=p.nextDouble();
			System.out.println();
			al.add(new Laptop(id,brand,price));
		}
		
		System.out.println("Before Sorting: ");
		for(Laptop l:al)
		{
			System.out.println(l);
		}
		
		Collections.sort(al);
		System.out.println();
		System.out.println("After Sorting: ");
		for(Laptop l:al)
		{
			System.out.println(l);
		}
	}
}
