package Practice;
import java.util.Scanner;

public class Neon_no_range {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int i=p.nextInt();
	for(int q=1;q<=i;q++)
	{
	int sq=q*q;
	int tmp=sq,sum=0;
	
	for(;tmp>0;tmp=tmp/10)
	{
		int r=tmp%10;
		sum=sum+r;
	}
	//System.out.println("sq"+sq);
	//System.out.println("sum"+sum);
	if(q==sum)
		System.out.println(q);
//	else
//		System.out.println(q);
	}
}
}
