package Practice;
import java.util.Scanner;
public class Range_of_SNum {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=p.nextInt();
		
		int sum=0;
		for(int tmp=1;tmp<=n;tmp++)
			{
				System.out.println(tmp);
				int f=1;
				int i=tmp%10;
				for(int i1=1;i1<=tmp;i1/=10)
				{
					f=f*tmp;
					i1++;
					
				}
				sum+=f;
			}
	}
}
