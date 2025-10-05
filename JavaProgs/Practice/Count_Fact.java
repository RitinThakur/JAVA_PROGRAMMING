package Practice;
import java.util.Scanner;

public class Count_Fact {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	int c=0;
	for(int a=1;n>=a;a++)
	{
		if(n%a==0)
			c++;
		
	}
	System.out.println("factor count: "+c);
}
}
