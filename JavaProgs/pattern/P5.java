package pattern;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int r=p.nextInt();
		System.out.print("Enter Number of Columns: ");
		int c=p.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
Enter Number of Rows: 5
Enter Number of Columns: 5
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
*/