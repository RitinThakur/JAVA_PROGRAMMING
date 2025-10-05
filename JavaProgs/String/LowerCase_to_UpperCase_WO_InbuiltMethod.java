package String;

import java.util.Scanner;

public class LowerCase_to_UpperCase_WO_InbuiltMethod {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=p.nextLine();
		
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				
				char c=ch[i];
				c-=32;
				ch[i]=c;
			}	
		}		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
		

	  }
}
