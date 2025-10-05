package pattern;

public class P11 {
	public static void main(String[] args) {
		char ch='A';
		for(int j=1;j<5;j++)
		{
			for(int i=1;i<5;i++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}

/*
A A A A 
B B B B 
C C C C 
D D D D 
*/