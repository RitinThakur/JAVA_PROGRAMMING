package Array;

import java.util.Scanner;

public class Prime_Num_In_arr {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter size of arr: ");
		int n=p.nextInt();
		int []a=new int[n];
		int c=0;

		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Num Value: ");
			a[i]=p.nextInt();
		}

		for(int j=0;j<a.length;j++)
		{
			for(int i=2;i<=a[j]/2;i++)
			{
				System.out.println(i);
				if(a[j]%i==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
				System.out.println(a[j]);
		}
		;

	}
}
