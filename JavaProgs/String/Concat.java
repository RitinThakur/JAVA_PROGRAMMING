package String;

import java.util.Scanner;

public class Concat {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter String-1: ");
		String str1=p.nextLine();
		System.out.print("Enter String-2: ");
		String str2=p.nextLine();
		String str3=str1.concat(str2);
		System.out.println("concatinated String: "+str3);
	}
}
