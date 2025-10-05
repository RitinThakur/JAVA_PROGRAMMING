package Array;

import java.util.Scanner;

public class Print_Odd_Elements {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int n=p.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value: ");
			a[i]=p.nextInt();
		}
		
		System.out.println();
		System.out.println("Elements Entered are as below");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
		System.out.println();
		System.out.println("Even Elements in array are as below");
		for(int k=0;k<a.length;k++)
		{
			if(a[k]%2!=0)
			System.out.println(a[k]);
		}
	}
}
