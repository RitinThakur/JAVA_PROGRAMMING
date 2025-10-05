package patterns0_9;

public class Four {
	public static void display() {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//			if(i+j==n-1 && i<=n/2)
				if((i==n-3 && j==0) || (i==n-4 && j==n-4) || (i==0 && j==n-3) || (j==n/2) || (i==n/2))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
