	package Practice;

import java.util.Scanner;

public class Amstrong_Num {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	
	int pr=0,t=n,t2=n,sum=0,d=0;
	
	while(t>0)
	{
		pr++;
		t=t/10;
	}
	
	while(t2>0)
	{
		int prd=1;
		d=t2%10;
//		System.out.println(d);
		for(int i=1;i<=pr;i++)
		{
			prd=prd*d;
		}
		sum=sum+prd;
		t2=t2/10;
//		System.out.println(t2);
//		System.out.println(sum);
//		System.out.println(prd);
	}
	
	if(n==sum)
		System.out.println(n+" is amstrong number");
	else
		System.out.println(n+" is not amstrong number");
	
	
}
}
