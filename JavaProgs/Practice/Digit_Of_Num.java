package Practice;
import java.util.Scanner;
public class Digit_Of_Num {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		
		System.out.println("Enter A Number:");
		int n=p.nextInt();
		int count=0;
				
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("Number of digits: "+count);
	}

}
