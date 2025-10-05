package NPTC;
import java.util.Scanner;
public class kk {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.println("Enter number of values : ");
	int n=p.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter "+(++i)+" value: ");
		a[i]=p.nextInt();
		sum=sum+a[i];
	}
	System.out.println("Sum:"+sum);
}
}
