package String;

import java.util.Scanner;

public class Reverse_String_Word_by_Word {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str1=p.nextLine();

		String [] str=str1.split(" ");
		String r = "";
		for(int i=str.length-1;i>=0;i--)
		{
			r=r+" "+str[i];
		}
		System.out.println("Result String: "+r);
	}
}
