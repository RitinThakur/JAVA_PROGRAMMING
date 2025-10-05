package String;

import java.util.Scanner;

public class ContentEquals {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter String-1: ");
		String str1=p.nextLine();
		System.out.print("Enter String-2: ");
		String str2=p.nextLine();
		System.out.print("Enter String-3: ");
		String str3=p.nextLine();
		
		
	    System.out.println(str1.contentEquals(str1));
	    System.out.println(str2.contentEquals(str2));
	    System.out.println(str3.contentEquals(str3));
	  }
}
