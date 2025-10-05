package Practice;
import java.util.Scanner;

public class Factors_Of_num {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int n=p.nextInt();
	
	/*while(n>=a)
	{
		if(n%a==0)
			System.out.println(a);
		a++;
	}*/
	
	for(int a=1;n>=a;a++)
	{
		if(n%a==0)
			System.out.println(a);
		
	}
}
}
