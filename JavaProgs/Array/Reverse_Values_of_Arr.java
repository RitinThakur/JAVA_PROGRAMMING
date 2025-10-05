package Array;

import java.util.Scanner;

public class Reverse_Values_of_Arr {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int n=p.nextInt();

		int []a=new int[n];

		for(int k=0;k<a.length;k++)
		{
			System.out.print("Enter value: ");
			a[k]=p.nextInt();
		}

		System.out.println();

		int i=0,j=a.length-1;
		for(;i<j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}

		System.out.println("Reversed Array as bellow");
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
