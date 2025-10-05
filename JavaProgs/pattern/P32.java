package pattern;

public class P32 {
	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch +" ");
				}
				else
					System.out.print(" ");
			}
			ch++;
			System.out.println();
		}
	}
}
/*
A    
B B   
C C C  
D D D D 
*/