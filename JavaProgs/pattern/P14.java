package pattern;

public class P14 {
	public static void main(String[] args) {
		int p=1;
		char c='A';
		for(int j=0;j<4;j++)
		{
			for(int i=0;i<4;i++)
			{
				if(i%2==0)
				{
					System.out.print(c+" ");

				}
				else
				{
					System.out.print(p+" ");

				}
			}
			c++;
			p++;
			System.out.println();
		}
	}
}

/*
A 1 A 1 
B 2 B 2 
C 3 C 3 
D 4 D 4 
*/
