package Practice;
import java.util.Scanner;

public class Print_Digits_From_Last_Place {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=p.nextInt();
		
		while(n>0)
		{
			System.out.print(n%10);
			n/=10;
		}
	}
	

}
