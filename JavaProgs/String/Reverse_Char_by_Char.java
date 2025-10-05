package String;

import java.util.Scanner;

public class Reverse_Char_by_Char {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=p.nextLine();
		String [] str2=str.split(" ");
		String out="";
		for(int i=0;i<str2.length;i++)
		{
			String str3="";
			String str4=str2[i];
			for(int j=str4.length()-1;j>=0;j--)
			{
				str3=str3+str4.charAt(j);
			}
			out=out+str3+" ";

		}
		System.out.println(out);
	}
}
