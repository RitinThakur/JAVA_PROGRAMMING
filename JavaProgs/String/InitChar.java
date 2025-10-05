package String;

import java.util.Scanner;

public class InitChar {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str1=p.nextLine();
		String [] str2=str1.split(" ");
		for(int i=0;i<str2.length;i++)
		{


			char[] c=str2[i].toCharArray();
			if(str2[i].charAt(0)>='a' && str2[i].charAt(0)<='z')
			{
				c[0]-=32;
			}
			String str3=new String(c);
			System.out.print(str3+" ");



		}
	}
}
