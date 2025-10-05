package pattern;

public class P12 {
	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<4;i++)
		{	
			for(int j=1;j<7;j++)
			{
				if(c%2!=0)
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
 1  3  5 
 7  9 11 
13 15 17
*/ 
