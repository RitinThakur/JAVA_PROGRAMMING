package String;

import java.util.Scanner;

public class No_Of_Vow_Cons {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=p.nextLine();
		int vow=0,cons=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vow++;
			else if(ch>='0' && ch<='9')
			{}
			else
				cons++;
		}
		System.out.println();
		System.out.println("Vowels: "+vow);
		System.out.println("Consonants: "+cons);
	}
}
