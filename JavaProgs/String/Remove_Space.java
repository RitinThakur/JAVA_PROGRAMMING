package String;

import java.util.Scanner;

public class Remove_Space {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str1=p.nextLine();
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==' ')
			{}
			else
				str2=str2+str1.charAt(i);
		}
		System.out.println("Output String: "+str2);

	}
}
