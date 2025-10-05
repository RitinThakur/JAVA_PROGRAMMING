//WAJP TO PRINT THE MISSING ELEMENTS FROM 1-10 IN INT ARRAY

package Array;

public class Missing_Elements {
	public static void main(String[] args) {
		int []a= {1,5,3,7,10};

		for(int i=1;i<=10;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					c++;
					break;
				}
			}
			if(c==0)
				System.out.println(i);
		}
	}
}
