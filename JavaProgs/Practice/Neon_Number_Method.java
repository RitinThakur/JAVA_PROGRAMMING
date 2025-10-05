package Practice;
import java.util.Scanner;
public class Neon_Number_Method {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	System.out.println(neon(n));	
}
public static String neon(int n)
{
	int sq=n*n;
	int tmp=sq,sum=0;
	for(;tmp>0;tmp=tmp/10)
	{
		int r=tmp%10;
		sum=sum+r;
	}
	//System.out.println("sq"+sq);
	//System.out.println("sum"+sum);
	if(n==sum)
		return "hi";
		//return n+" is a neon number";
	else
		return "bye";
		//return n+" is not a neon number";
	
}
}
