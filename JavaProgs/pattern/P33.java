package pattern;

public class P33 {
	public static void main(String[] args) {
		int n=4,a=1;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{

				if(i>=j)
				{
					if(i%2==0)
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
A B   
2 3 4  
C D E F 
*/