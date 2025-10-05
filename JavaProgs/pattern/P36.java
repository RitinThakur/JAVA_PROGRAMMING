package pattern;

public class P36 {
	public static void main(String[] args) {
		char ch='a';
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==0 || i==2)
				{

					if(i>=j)
					{
						System.out.print(ch++);
					}
					else
						System.out.print(" ");
				}
				else if(i==1)
				{
					int a=1;

					if(i>=j)
					{
						System.out.print(a);
					}
					else
						System.out.print(" ");

				}
				else if(i==3)
				{
					int a=2;

					if(i>=j)
					{
						System.out.print(a);
					}
					else
						System.out.print(" ");
				}
			}
			System.out.println();		
		}
	}
}
/*
a   
11  
bcd 
2222
*/