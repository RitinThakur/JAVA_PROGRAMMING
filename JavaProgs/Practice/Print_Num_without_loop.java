package Practice;

import java.util.Scanner;

public class Print_Num_without_loop {
	public static void main(String[] args) {
		pNum(1);
	}
	public static void pNum(int n)
	{
		if(n<=5)
		{
			System.out.println(n);
			pNum(n+1);
		}
	}
}
