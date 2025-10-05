package pattern;

public class P16 {
	public static void main(String[] args) {
		int p=1;
		char c='A';
		for(int j=0;j<4;j++)
		{
			for(int i=0;i<4;i++)
			{
				if(j%2==0)
				{
					System.out.print(c+" ");
				}
				else
				{
					System.out.print(p+" ");
				}
			}
			System.out.println();
		}
	}
}

/*
A A A A 
1 1 1 1 
A A A A 
1 1 1 1 
*/