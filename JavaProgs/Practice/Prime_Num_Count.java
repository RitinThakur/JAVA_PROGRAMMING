package Practice;

import java.util.Scanner;

public class Prime_Num_Count {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int m=p.nextInt();
		int count=0;
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
				count++;
			}
		}
		System.out.println("Number of Prime Numbers: "+count);
		
	}
}
