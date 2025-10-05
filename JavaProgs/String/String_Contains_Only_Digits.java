package String;

import java.util.Scanner;

public class String_Contains_Only_Digits {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=p.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' &&str.charAt(i)<='z'))
			{
				c++;
				break;
			}

		}
		if(c>0)
			System.out.println("String has characters");
		else
			System.out.println("String only has digits");
	}
}
