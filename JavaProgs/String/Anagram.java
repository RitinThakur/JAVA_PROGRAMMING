package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter 1st String: ");
		String str1=p.nextLine();
		System.out.print("Enter 2nd String: ");
		String str2=p.nextLine();


		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();


		if(str1.length() == str2.length()) {


			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();


			Arrays.sort(charArray1);
			Arrays.sort(charArray2);



			boolean result = Arrays.equals(charArray1, charArray2);

			if(result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			}
			else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}
		else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}
}

