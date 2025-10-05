package pattern;

public class P30 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
			int a=1;
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(a++ +" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
1    
1 2   
1 2 3  
1 2 3 4 
*/