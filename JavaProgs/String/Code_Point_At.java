package String;

import java.util.Scanner;

public class Code_Point_At {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=p.nextLine();

		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.codePointAt(i));
		}

	}
}
