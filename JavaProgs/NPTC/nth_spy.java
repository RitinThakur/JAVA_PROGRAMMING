package NPTC;

import java.util.Scanner;

public class nth_spy {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=p.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int sum=0,product=1;
			int a=i;
		
		while(a>0)
		{
			int r=a%10;
			sum=sum+r;
			product=product*r;
			a/=10;
					
		}
		
		/*for(;n>0;n=n/10)
		{
			int r=n%10;
			sum=sum+r;
			product=product*r;
		}*/
		if(sum==product)
		System.out.println(i);
		}

	}
}
