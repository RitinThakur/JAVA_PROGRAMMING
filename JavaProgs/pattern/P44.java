package pattern;

public class P44 {
	public static void main(String[] args) throws Exception {
		int n=5;
		for(int i=0;i<n;i++) //J
		{
//			Thread.sleep(2000);
			for(int j=0;j<n;j++) 
			{
				if(i==0 || j==n/2 || i==n-1 && j<=n/2) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //A 
			{
				if(i==0 || j==0 || i==n/2 || j==n-1) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //V
			{
				if(j==0 && i<=n/2 || j==n-1 && i<=n/2 || i==3 && j==1 || i==3 && j==3 || i==4 && j==2) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //A
			{
				if(i==0 || j==0 || i==n/2 || j==n-1) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
