package String;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter The String: ");
		String str1=p.nextLine();

		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}


		if(str1.equals(str2))
		{
			System.out.println("String entered is palindrome");
		}
		else
			System.out.println("String entered is not palindrome");
	}
}


