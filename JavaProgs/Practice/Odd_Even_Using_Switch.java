package Practice;
import java.util.Scanner;

public class Odd_Even_Using_Switch {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	
	switch(n%2)
	{
	case 0:
	
		System.out.println(n+" is Even");
		break;
	default:
		System.out.println(n+" is Odd");
	}
}
}
