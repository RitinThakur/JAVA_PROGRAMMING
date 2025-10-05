package Practice;
import java.util.Scanner;
public class Strong_Number_method {
public static void main(String[] args) {
			Scanner p=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=p.nextInt();
		System.out.println(sNum(n));
		/*int sum=0,tmp=n;
		for(;tmp>0;tmp=tmp/10)
		{
			int r=tmp%10,f=1;
			for(int i=1;i<=r;i++)
			{
				f=f*i;
			}
			sum+=f;
	
//			System.out.println(f);
//			System.out.println(sum);
//			System.out.println();
		}
		
			if(sum==n)
				System.out.println(n+" is a strong number");
			else
				System.out.println(n+" is not a strong number");*/
			
		}

/*private static String sNum(int n) {
	int sum=0,tmp=n;
	for(;tmp>0;tmp=tmp/10)
	{
		int r=tmp%10,f=1;
		for(int i=1;i<=r;i++)
		{
			f=f*i;
		}
		sum+=f;

//		System.out.println(f);
//		System.out.println(sum);
//		System.out.println();
	}
	
		if(sum==n)
			return n+" is a strong number";
		else
			return n+" is not a strong number";
		
	}*/
private static String sNum(int n) {
	int sum=0,tmp=n;
	for(;tmp>0;tmp=tmp/10)
	{
		int r=tmp%10,f=1;
		for(int i=1;i<=r;i++)
		{
			f=f*i;
		}
		sum+=f;

//		System.out.println(f);
//		System.out.println(sum);
//		System.out.println();
	}
	
		if(sum==n)
			return ""+n;
		else
			return "-"+n;
}
}



