package Practice;

import java.util.Scanner;

public class Prime_Num_Range {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Starting number: ");
		int n=p.nextInt();
		System.out.print("Enter Ending number: ");
		int m=p.nextInt();

		for(int i=n;i<=m;i++)
		{
			int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					c++;	
			}
			if(c==0 && i!=1)
			{
				System.out.println(i);
			}
		}

	}
}
