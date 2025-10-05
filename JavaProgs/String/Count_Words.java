package String;

import java.util.Scanner;

public class Count_Words {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str=p.nextLine();
		String[] str2 = str.split(" ");
		
		int c=str2.length;
		for(int i=0;i<str2.length;i++)
		{
			if(str2[i].contains(","))
			{
				str2[i].split(",");
			}
			
		}
		System.out.println("Count of words: "+c);
	}
}
