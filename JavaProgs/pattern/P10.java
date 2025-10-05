package pattern;

public class P10 {
	public static void main(String[] args) {
		for(int j=1;j<5;j++)
		{
			char ch='A';
			for(int i=1;i<5;i++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}

/*
A B C D 
A B C D 
A B C D 
A B C D 
*/