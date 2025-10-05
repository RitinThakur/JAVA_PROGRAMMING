package String;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter The String: ");
		String str1=p.nextLine();

		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println("Reversed String:"+str2);
	}
}
