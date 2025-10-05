package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Own_Object_Dr {
	public static void main(String[] args) {

		Scanner p=new Scanner(System.in);
		System.out.print("Enter number of products: ");
		int num=p.nextInt();
		Own_2_Objects_Blueprint [] d=new Own_2_Objects_Blueprint[num];
		System.out.println();
		for(int i=0;i<d.length;i++)
		{
			System.out.println("Enter details of "+(i+1)+" Product");
			System.out.print("Enter Product id: ");
			int id=p.nextInt();

			System.out.print("Enter Product Price: ");
			double price=p.nextDouble();

			d[i]=new Own_2_Objects_Blueprint(id,price);
			System.out.println();
		}

		System.out.println("Before Sorting: ");

		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		Arrays.sort(d);
		System.out.println();

		System.out.println("After Sorting: ");
		System.out.println();
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}

}

