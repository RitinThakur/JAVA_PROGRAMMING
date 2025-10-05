package String;

import java.util.Scanner;

public class Char_Arr_To_String {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter number of Characters: ");
		int n=p.nextInt();
		
		char [] ch=new char[n];
		for(int i=0;i<ch.length;i++)
		{
			System.out.print("Enter the value: ");
			ch[i]=p.next().charAt(0);
		}
//		char []ch= {'H','I','T','E','N'};
		String s="";
		for(char c:ch)
		{
			s=s+c;
		}
		System.out.println();
		System.out.println("you have entered: "+s);
	}

}
