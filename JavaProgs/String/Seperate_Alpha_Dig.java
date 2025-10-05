package String;

import java.util.Scanner;

public class Seperate_Alpha_Dig {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the alphanumeric String: ");
		String str1=p.nextLine();
		String al="",n="";
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			if(c>='0' && c<='9')
			{
				n=n+c;
			}
			else if(c>='A' && c<='Z' || c>='a' && c<='z' )
			{
				al=al+c;
			}

		}
		System.out.println("Alphabets: "+al);
		System.out.println("Numerics: "+n);
	}
}
