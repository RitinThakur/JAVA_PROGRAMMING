package String;

import java.util.Scanner;

public class Validate_Pass {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Password: ");
		String str=p.nextLine();

		//8-14 CHARS
		if(str.length()>=8 && str.length()<=14)
		{
			int upp=0,low=0,dig=0,spac=0,spc=0;
			for(int i=0;i<str.length();i++)
			{


				//ATLEAST 1 UPPER CASE
				if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				{
					upp++;
				}

				//ATLEAST 1 LOWER CASE
				else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				{
					low++;
				}

				//ATLEAST 1 DIGIT
				else if(str.charAt(i)>='0' && str.charAt(i)<='9')
				{
					dig++;
				}

				//SHOULD NOT HAVE SPACE
				else if(str.charAt(i)==' ')
				{
					spac++;
				}

				//ATLEAST 1 SPECIAL CHAR
				else
				{
					spc++;
				}

			}
			if(upp>0 && low>0 && dig>0 && spac==0 && spc>0)
			{
				System.out.println("Its Valid Password");
			}

			else
				System.out.println("Invalid Password");
		}
		else
		{
			System.out.println("Invalid Password");
			System.out.println("Length of password should be 8-14 chars");
		}
	}
}
