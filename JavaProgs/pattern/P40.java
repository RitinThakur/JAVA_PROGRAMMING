package pattern;

public class P40 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		
		for(int i=0;i<n;i++)
		{
			char ch='a';
			for(int j=0;j<n;j++)
			{
				
				if(i==0 || i==2)
				{
					if(i<=j)
					{
						System.out.print(ch++);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==1 || i==3)
				{
					if(i<=j)
					{
						System.out.print(a);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
/*
abcd
 111
  ab
   1
*/