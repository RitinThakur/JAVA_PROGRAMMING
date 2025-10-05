package String;

import java.util.Scanner;

public class Output_vow_Cons {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=p.nextLine();


		String vow="",cons="";
		for(int i=0;i<str.length();i++)
		{

			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					vow=vow+ch;
				}

				else
				{
					cons=cons+ch;
				}
			}
		}
		System.out.println("Vowels: "+vow);
		System.out.println("Consonants: "+cons);
	}
}
