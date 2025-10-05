package collection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Sum_Of_Elements_Non_Genric {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=p.nextInt();
		ArrayList al=new ArrayList();
		
//		try {
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element "+(i+1)+": ");
			al.add(p.nextInt());
		}
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Please enter only digits");
//		}
		
		int sum=0;
//		for(Object o:al)
//		{
//			Integer m=(Integer) o;
//			sum=sum+m;
//			sum=sum+(Integer)o;
//		}
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			sum=sum+(Integer)i.next();
		}
		System.out.println();
		System.out.println("Sum: "+sum);
	}
}
