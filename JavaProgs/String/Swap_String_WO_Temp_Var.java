package String;

import java.util.Scanner;

public class Swap_String_WO_Temp_Var {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("Please Enter 2 Different Strings");
		System.out.print("Enter 1st String: ");
		String str1=p.nextLine();
		System.out.print("Enter 2nd String: ");
		String str2=p.nextLine();
		System.out.println();
		System.out.println("Before Swapping:");
		System.out.println("1st String: "+str1);
		System.out.println("2nd String: "+str2);
		System.out.println();
		System.out.println("After Swapping:");
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("1st String: "+str1);
		System.out.println("2nd String: "+str2);
	}
}
