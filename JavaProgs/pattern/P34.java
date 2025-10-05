package pattern;

public class P34 {
	public static void main(String[] args) {
		int n=4,a=1;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{

				if(i>=j)
				{
					if(j%2==0)
					{

						System.out.print(a++ +" ");
					}
					else
						System.out.print(ch++ +" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}
}

/*
1    
2 A   
3 B 4  
5 C 6 D 
*/