package Practice;

import java.util.Scanner;

public class Fibonacci_Ser {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		System.out.print("Enter the number of values required: ");
		int n=p.nextInt();
		int a=0,b=1;
		System.out.println();
		System.out.print(a+" ");
		System.out.print(b+" ");

		for(int i=3;i<=n;i++)
		{
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}


	}
}
