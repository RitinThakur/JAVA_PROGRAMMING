package Practice;
import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int n=p.nextInt();
		int sum=0;
		
		System.out.println();
		System.out.print("FACTORS: ");
		
		/*for(int a=1;n>a;a++)
		{
			if(n%a==0)
			{
				System.out.print(" "+a);
				sum=sum+a;
			}			
		}*/
		// MORE NUMBER OF ITTERATIONS IN ABOVE FOR LOOP
		// SO FOLLOW BELOW FOR LOOP SO AS IT TAKES LESS ITTERATIONS AND TAKES LESS TIME
		for(int a=1;(n/2)>=a;a++)
		{
			if(n%a==0)
			{
				System.out.print(" "+a);
				sum=sum+a;
			}			
		}
		System.out.println();
		System.out.println("sum: " +sum);
		 
		 
		System.out.println();
		System.out.println();
		if(n==sum)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+ " is not a perfect number");
	}

}
