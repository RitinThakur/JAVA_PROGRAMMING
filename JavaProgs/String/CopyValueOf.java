package String;

import java.util.Scanner;

public class CopyValueOf {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str1=p.nextLine();

		char[]ch=str1.toCharArray();
		String str2=str1.copyValueOf(ch);

		System.out.println("Output String: "+str2);
	}
}
