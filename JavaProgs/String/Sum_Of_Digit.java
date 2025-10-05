package String;

import java.util.Scanner;

public class Sum_Of_Digit {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=p.nextLine();

		char[]ch=str.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				
				c=c+(ch[i]-48);
			}
		}
		System.out.println("No. Of Digits: "+c);
	}
}
