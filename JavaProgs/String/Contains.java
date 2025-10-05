package String;

import java.util.Scanner;

public class Contains {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter String-1: ");
		String str1=p.nextLine();
		System.out.print("Enter String-2: ");
		String str2=p.nextLine();
		boolean str3=str1.contains(str2);
		if(str3)
		System.out.println("characters are present in String");
		else
			System.out.println("Characters are not present in String");
	}
}
