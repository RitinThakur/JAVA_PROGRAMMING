package Practice;
import java.util.Scanner;
public class Sum_Of_Digits {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.println("Enter a Number: ");
	int n=p.nextInt();
	int sum=0;
	while(n>0)
	{
		sum=sum+(n%10);
		n=n/10;
	}
	System.out.println("Sum of digits: "+sum);
}
}
