package pattern;

public class P17 {
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
					c++;
				}
				else
				{
					System.out.print(p+" ");
					p++;
				}
			}
			System.out.println();
		}
	}
}

/*
A B C D 
1 2 3 4 
E F G H 
5 6 7 8 
*/