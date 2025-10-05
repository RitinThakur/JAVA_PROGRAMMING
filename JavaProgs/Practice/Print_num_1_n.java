package Practice;

import java.util.Scanner;

public class Print_num_1_n {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n=p.nextInt();

		pNum(n);

	}
	public static void pNum(int n)
	{
		if(n>0)
		{
			pNum(n-1);
			System.out.println(n);
		}
	}
}
