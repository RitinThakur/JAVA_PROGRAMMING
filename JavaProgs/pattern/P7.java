package pattern;

public class P7 {
	public static void main(String[] args) {
		char c='A';
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}
/*
A B C D 
E F G H 
I J K L 
M N O P 
*/