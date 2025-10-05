package Practice;
import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n=p.nextLong();
		//int n=p.nextInt();
		long pro=1;
		/*while(n>0)
		{
			int r=n%10;
			pro=pro*r;
			n=n/10;
		}*/
		for(long r=1;n>0;n=n/10)
		{
			r= (n%10);
			pro=pro*r;
			
		}
		System.out.println("Product of Digit : "+pro);
	}
}
