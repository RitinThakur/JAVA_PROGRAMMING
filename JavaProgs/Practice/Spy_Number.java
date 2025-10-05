package Practice;
import java.util.Scanner;
public class Spy_Number {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=p.nextInt();
		int sum=0,product=1;
		/*while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			product=product*r;
			n/=10;
					
		}*/
		for(;n>0;n=n/10)
		{
			int r=n%10;
			sum=sum+r;
			product=product*r;
		}
		if(sum==product)
		System.out.println("It is Spy Number");
		else
			System.out.println("It is not Spy Number");
	}

}
