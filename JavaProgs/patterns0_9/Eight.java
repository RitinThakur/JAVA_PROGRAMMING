package patterns0_9;

public class Eight {
public static void display() {
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==0 && j!=0 & j!=n-1 || i==n-4 && (j==0 || j==n-1) || i==n-3 && j!=0 && j!=n-1 || i==n-2 && (j==0 || j==n-1) || i==n-1 && j!=0 && j!=n-1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
