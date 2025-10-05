package String;

import java.util.Scanner;

public class Code_Point_Count {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=p.nextLine();

		for(int i=1;i<str.length();i++)
		{
			System.out.println(str.codePointCount(i, str.length()));
		}

	}
}
