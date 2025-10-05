package Practice;

import java.util.Scanner;

public class nth_Spy_without_method {
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
		
/*		for(;a>0;a=a/10)
		{
			int r=a%10;
			sum=sum+r;
			product=product*r;
		}*/
		if(sum==product)
		System.out.println(i);
		}

	}

}
