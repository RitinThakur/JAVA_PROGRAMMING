package Practice;

import java.util.Scanner;

public class Palindrome_Num {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n=p.nextInt();

		int tmp=n,r=0,d=0;
		while(tmp>0)
		{
			d=tmp%10;
			r=r*10+d;
			tmp=tmp/10;
		}

		if(r==n)
			System.out.println(n+" is palindrome Number");
		else
			System.out.println(n+" is not palindrome Number");

	}
}
