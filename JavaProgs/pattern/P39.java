package pattern;

public class P39 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
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
			a++;
			System.out.println();
		}
	}
}
/*
1111
 222
  33
   4
*/