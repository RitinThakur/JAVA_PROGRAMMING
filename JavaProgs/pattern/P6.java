package pattern;

public class P6 {
	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<5;i++)
		{	
			for(int j=1;j<5;j++)
			{
				if(c<10)
				{
					System.out.print(" "+c+" ");
					c++;
				}
				else
				{
				System.out.print(c+" ");
				c++;
				}
			}
			System.out.println();
		}
	}
}
/*
1  2  3  4 
5  6  7  8 
9 10 11 12 
13 14 15 16 
*/