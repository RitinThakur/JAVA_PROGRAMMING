package Practice;
import java.util.Scanner;

public class Even_1_N_WO_Loop {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter Range value: ");
	int n=p.nextInt();
	
	eNum(n);
}
public static void eNum(int n)
{
	if(n>0)
	{
		eNum(n-1);
		if(n%2==0)
		{
		System.out.println(n);
		}
	}
}
}
