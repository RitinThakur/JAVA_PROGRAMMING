package String;

import java.util.Scanner;

public class All_The_Best__The {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter 3 Word: ");
		String str=p.nextLine();
		System.out.print("Enter Character for word search: ");
		char ch=p.next().charAt(0);
		int c=0;
		String [] str2=str.split(" ");
//		System.out.println("Middle word: "+str2[1]);

		
			for(int j=0;j<str2.length;j++)
			{
				if(ch==str2[j].charAt(0))
				{
					System.out.println(str2[j]);
					break;
				}
				else
					c++;
			}
		
		if(c>0)
			System.out.println("No Match Found");
	}
}
