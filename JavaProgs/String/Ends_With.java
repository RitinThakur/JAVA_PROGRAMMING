package String;

import java.util.Scanner;

public class Ends_With {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str1=p.nextLine();

		System.out.print("Enter the Expected Ending value: ");
		String str2=p.nextLine();

		if(str1.endsWith(str2))
			System.out.println(str1+" Ends with "+str2);

		else
			System.out.println(str1+" doesn't Ends with "+str2);
	}
}
