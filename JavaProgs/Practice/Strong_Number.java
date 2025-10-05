package Practice;
import java.util.Scanner;
public class Strong_Number {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=p.nextInt();
		
		int sum=0,tmp=n;
		for(;tmp>0;tmp=tmp/10)
		{
			int r=tmp%10,f=1;
			for(int i=1;i<=r;i++)
			{
				f=f*i;
			}
			sum+=f;
	
			System.out.println(f);
	//		System.out.println(sum);
			System.out.println();
		}
		
			if(sum==n)
				System.out.println(n+" is a strong number");
			else
				System.out.println(n+" is not a strong number");
			
		}
	
	/*public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
            System.out.println("Enter your integer number: ");
            int n=s.nextInt();
            
            int temp=n;
            int sum=0;
            
            while (n>0)
            {
            	int res=n%10;
            	int fact=1;
            	
            	for(int i=1;i<=res;i++)
            	{
            		fact=fact*i;
            	}
            	sum=sum+fact;
            	n=n/10;
           
            }
            
            if(sum==temp)
            {
            	System.out.println(temp+" is a strong number...");
            }
            else
            {
            	System.out.println(temp+" is not a strong number...");
            }
            
	}*/

}


