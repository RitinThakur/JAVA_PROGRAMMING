package Practice;

import java.util.Scanner;

public class Prime_Num_Sum {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int m=p.nextInt();
		int sum=0,c1=0;
		for(int i=1;i<=m;i++)
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
				sum+=i;
				c1++;
			}
		}
		System.out.println("Count of prime Numbers:"+c1);
		System.out.println("Sum of Prime Numbers: "+sum);
	}
}
