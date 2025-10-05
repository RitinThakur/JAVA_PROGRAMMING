package pattern;

public class P8 {
	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<4;i++)
		{	
			for(int j=1;j<9;j++)
			{
				if(c%2==0)
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
				else
					c++;
			}
			System.out.println();
		}
	}
}
/*
2  4  6  8 
10 12 14 16 
18 20 22 24 
*/