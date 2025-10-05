package String;

import java.util.Scanner;

public class UpperCase_To_LowerCase {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=p.nextLine();

		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{

				char c=ch[i];
				c+=32;
				ch[i]=c;
			}	
			else
			{}

		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
}
