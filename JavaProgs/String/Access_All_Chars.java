package String;

import java.util.Scanner;

public class Access_All_Chars {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter String: ");
	String s=p.nextLine();
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
}
}
