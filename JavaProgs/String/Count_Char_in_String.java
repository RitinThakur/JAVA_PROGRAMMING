package String;

import java.util.Scanner;

public class Count_Char_in_String {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter the String: ");
	String str=p.nextLine();
	int c=0,num=0,spcl=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
		{
			
		}
		else if(str.charAt(i)>='0' && str.charAt(i)<='9')
		{
			num++;
		}
		else if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z'))
		c++;
		
		else
			spcl++;
		
	}
	System.out.println("Alphabet: "+c);
	System.out.println("Numeric: "+num);
	System.out.println("Special Char: "+spcl);
	System.out.println();
	System.out.println("Total: "+(c+num+spcl));
}
}
