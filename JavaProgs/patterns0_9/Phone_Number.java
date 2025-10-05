package patterns0_9;

import java.util.Scanner;

public class Phone_Number {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter your phone number: ");
	String ph=p.next();
	
	char [] phno=ph.toCharArray();
	
	for(int i=0;i<phno.length;i++)
	{
		if(phno[i]=='0')
		{
			Zero.display();
			System.out.println();
			
		}
		else if(phno[i]=='1')
		{
			One.display();
			System.out.println();
		}
		else if(phno[i]=='2')
		{
			Two.display();
			System.out.println();
		}
		else if(phno[i]=='3')
		{
			Three.display();
			System.out.println();
		}
		else if(phno[i]=='4')
		{
			Four.display();
			System.out.println();
		}
		else if(phno[i]=='5')
		{
			Five.display();
			System.out.println();
		}
		else if(phno[i]=='6')
		{
			Six.display();
			System.out.println();
		}
		else if(phno[i]=='7')
		{
			Seven.display();
			System.out.println();
		}
		else if(phno[i]=='8')
		{
			Eight.display();
			System.out.println();
		}
		else if(phno[i]=='9')
		{
			Nine.display();
			System.out.println();
		}
		
			
	}
	
	
}
}
