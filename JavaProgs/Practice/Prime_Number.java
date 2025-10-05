package Practice;
import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n=p.nextInt();
		int c=0;

		for(int i=2;i<=n/2;i++)
		{
//			System.out.println(i);
			if(n%i==0)
			{
				c++;
				break;
			}
		}

		if(c==0 && n!=1)
			System.out.println(n+" is prime number");

		else
			System.out.println(n+" is not prime number");


	}
}
