package String;

import java.util.Scanner;

public class compare_To {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter String-1: ");
		String str1=p.nextLine();
		System.out.print("Enter String-2: ");
		String str2=p.nextLine();
		int n=str1.compareTo(str2);
		
		if(n==0)
		{
			System.out.println("Both strings are same");
		}
		else
			System.out.println("Both Strings are different");
	}
}
