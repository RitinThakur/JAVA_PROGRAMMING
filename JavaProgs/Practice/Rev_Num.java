package Practice;

import java.util.Scanner;

public class Rev_Num {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=p.nextInt();

		int r=0,tmp=n;
		/*while(n>0)
	{
		d=n%10;
		r=r*10+d;
		n=n/10;
	}*/

		for(int d=0;n>0;n=n/10)
		{
			d=n%10;
			r=r*10+d;
		}

		System.out.println("Rev of "+tmp+" is "+r);
	}
}
