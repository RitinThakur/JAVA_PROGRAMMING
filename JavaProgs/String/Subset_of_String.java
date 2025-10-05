package String;

import java.util.Scanner;

public class Subset_of_String {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str1=p.nextLine();
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			str2=str2+c;
			System.out.println(str2);
		}
	}
}
