package Practice;

public class Neon_Number_1_100 {
public static void main(String[] args) {
	for(int q=1;q<=100;q++)
	{
		int sq=q*q;
		int tmp=sq,sum=0;
		for(;tmp>0;tmp=tmp/10)
		{
			int r=tmp%10;
			sum=sum+r;
		}
		if(q==sum)
			System.out.println(q);
	}
}
}
