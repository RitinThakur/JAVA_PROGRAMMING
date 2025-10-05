package String;

import java.util.Scanner;

public class Duplicate_Char {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=p.nextLine();
		
		String str2=str.toLowerCase();
		
//		char [] ch=str.toCharArray();
		
		char [] ch2=str2.toCharArray();
		
//		boolean [] b=new boolean[ch.length];
		
		boolean [] b2=new boolean[ch2.length];

//		for(int i=0;i<ch.length;i++)
//		{
//			if(b[i]==false)
//			{
//				int c=1;
//				for(int j=i+1;j<ch.length;j++)
//				{
//					if(ch[j]==ch[i])
//					{
//						c++;
//						b[j]=true;
//					}
//				}
//				System.out.println(ch[i]+" : "+c);
//			}
//		}
		
		for(int i=0;i<ch2.length;i++)
		{
			if(b2[i]==false)
			{
				int c=1;
				for(int j=i+1;j<ch2.length;j++)
				{
					if(ch2[j]==ch2[i])
					{
						c++;
						b2[j]=true;
					}
				}
				if(c>1)
					System.out.println(ch2[i]+" is duplicate char");
			}
		}
	}
}
