package Practice;
import java.util.Scanner;

public class Perfect_Method {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter A Numnber: ");
	int n=p.nextInt();
	
	System.out.println(perfect(n));
}
public static String perfect(int a)
{
	int sum=0;
	for(int m=1;m<=a/2;m++)
	{
		if(a%m==0)
		{
			
			sum=sum+m;
		}			
	}
	
	if(sum==a)
	{
		return a+" is Perfect number";
	}
	else
	{
		return a+" is not Perfect number";
	}
}
}
