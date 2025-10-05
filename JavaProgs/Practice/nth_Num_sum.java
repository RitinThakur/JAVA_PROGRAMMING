package Practice;
import java.util.Scanner;

public class nth_Num_sum {
	public static void main(String[] args) {
	
		Scanner p=new Scanner(System.in);
		System.out.println("Enter A number: ");
		int r=p.nextInt();
		int sum=0;
		
		for(int n=1;n<=r;n++)
		{
			sum=sum+n;
		}
		System.out.println("Sum of 1-"+r+":"+sum);
	}
	


}
