package pattern;

public class P31 {
	public static void main(String[] args) {
		int n=4,a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(a +" ");
				}
				else
					System.out.print(" ");
			}
			a++;
			System.out.println();
		}
	}
}
/*
1    
2 2   
3 3 3  
4 4 4 4 
*/