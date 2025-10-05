package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_Elements_Genric {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=p.nextInt();
		ArrayList <Integer> al=new ArrayList<Integer>();


		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element "+(i+1)+": ");
			al.add(p.nextInt());
		}

		int sum=0;
		for(Integer o:al)
		{
			sum=sum+o;
			sum=sum+(Integer)o;
		}
		System.out.println();
		System.out.println("Sum: "+sum);

	}
}
