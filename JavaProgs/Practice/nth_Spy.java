package Practice;
import java.util.Scanner;

public class nth_Spy {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=p.nextInt();
		int sum=0,pro=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum(i);
			pro=pro(i);
			if(sum==pro)
				System.out.println(i);
		}
		
		
	}
	
	public static int sum(int r)
	{
		int sum=0;
		
		for(int n=1;r!=0;r=r/10)
		{
			int temp=r%10;
			sum=sum+temp;
		}
		return sum;
	}
	
	public static int pro(int r)
	{
		int pro=1;
		
		for(int n=1;r!=0;r=r/10)
		{
			int temp=r%10;
			pro=pro*temp;
		}
		return pro;
	}
}

