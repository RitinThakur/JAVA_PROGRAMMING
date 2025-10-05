package String;

import java.util.Scanner;

public class Unique_Words {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str1=p.nextLine();
		String str2=str1.toLowerCase();
		String [] str3=str2.split(" ");
//		String [] str3=str1.split(" ");
		boolean [] b=new boolean[str1.length()];
		
//		System.out.println();
//		System.out.println("WORD : OCCURANCE");
		System.out.println("Unique words");
		System.out.println("==================");
		
		for(int i=0;i<str3.length;i++)
		{
			if(b[i]==false)
			{
				int c=1;
				for(int j=i+1;j<str3.length;j++)
				{
					if(str3[i].equals(str3[j]))
					{
						c++;
						b[j]=true;
					}
				}
				if(c==1)
				System.out.println(str3[i]);
			}
		}
	}
}
