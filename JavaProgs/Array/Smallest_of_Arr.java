package Array;

import java.util.Scanner;

public class Smallest_of_Arr {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=p.nextInt();
		
		int [] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the value: ");
			a[i]=p.nextInt();
		}
		
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println(small+" is Smallest");
	}
}
