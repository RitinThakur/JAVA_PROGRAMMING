package Array;

import java.util.Scanner;

public class Repeated_Elements {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n=p.nextInt();

		int [] a=new int[n];
		boolean [] b=new boolean[a.length];

		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Value: ");
			a[i]=p.nextInt();
		}
		System.out.println();
		System.out.println("Repeated element");

		for(int i=0;i<a.length;i++)
		{
			if(b[i]==false)
			{
				int c=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]==a[i])
					{
						c++;
						b[j]=true;
					}

				}
				if(c>1)
					System.out.println(a[i]);
			}
		}
	}
}
