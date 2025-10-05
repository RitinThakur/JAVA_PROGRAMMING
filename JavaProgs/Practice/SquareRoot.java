package Practice;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=p.nextInt();
	int c=0;
			int i=1;
	
	for(;i<n;i++)
	{
		if(i*i==n)
		{
			c++;
			break;
		}
		
	}
	if(c==1)
		System.out.println(i+" is Square Root of "+n);
	else
		System.out.println(n+" Dont have a Square Root");
}
}
