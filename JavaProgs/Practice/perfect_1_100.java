package Practice;

public class perfect_1_100 {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++)
	{
		int sum=0;
		for(int a=1;(i/2)>=a;a++)
		{
			if(i%a==0)
			{
				//System.out.print(" "+a);
				sum=sum+a;
			}			
		}
		if(i==sum)
		System.out.println(i+" is perfect number");
		/*else
			System.out.println(i+" is not perfect number");*/
	}
}
}
