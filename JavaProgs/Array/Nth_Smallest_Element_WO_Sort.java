package Array;

import java.util.Scanner;

public class Nth_Smallest_Element_WO_Sort {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Size Of Array: ");
		int s=p.nextInt();
		
		int []a=new int[s];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value: ");
			a[i]=p.nextInt();
		}
		
		System.out.println();
		System.out.println("Enter which largest element you want from 1 to "+a.length+":");
		int n=p.nextInt();
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
					c++;
			}
			if(c==n-i)
			{
				System.out.println(a[i]);
				break;
			}
		}
	 	
	}
}
