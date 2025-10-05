package Practice;
import java.util.Scanner;

public class Prime_Number_method {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	
	System.out.println(prNo(n));
}
public static boolean prNo(int n)
{
	int c=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		c++;
		
	}
	if(c==0)
		return true;
	else
		return false;
}
}
