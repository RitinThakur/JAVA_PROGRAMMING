package String;

import java.util.Scanner;

public class Doesnot_Contain_Digits {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=p.nextLine();
		try {
			Integer.parseInt(str);
			System.out.println("String contains only Digits");
		}
		catch(Exception e){
			System.out.println("String Contains Characters");
		}
	}
}
