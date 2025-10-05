package NPTC;

import java.util.Scanner;

public class Freq {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n=p.nextInt();

		int [] a=new int[n];

		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Value: ");
			a[i]=p.nextInt();
		}
		System.out.println();
		System.out.print("Enter the Element to be Found: ");
		int n2=p.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n2)
				c++;
		}

		System.out.println("Frequency of "+n2+" is "+c);

	}
}

