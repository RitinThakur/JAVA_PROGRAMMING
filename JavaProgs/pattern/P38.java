package pattern;

public class P38 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==2)
				{
					if(i+j>=n-1)
					{
						System.out.print(ch);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==1 || i==3)
				{
					if(i+j>=n-1)
					{
						System.out.print(a++);
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
   a
  12
 aaa
3456
*/