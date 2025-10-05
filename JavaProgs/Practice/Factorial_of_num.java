package Practice;
import java.util.Scanner;

public class Factorial_of_num {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	int pr=1;
	/*for(int i=1;i<=n;i++)
	{
		pr=pr*i;
	}*/
	
	for(int i=n;i>=1;i--)
	{
		pr=pr*i;
		//System.out.println(pr);
	}
	
	System.out.println("Factorial: "+pr);
}
}
