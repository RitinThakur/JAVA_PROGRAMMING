package Practice;
import java.util.Scanner;

public class Positive_Negative_Zero {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	
	if(n>0)
		System.out.println(n+" is Positive");
	else if(n<0)
		System.out.println("("+n+") is Negative");
	else
		System.out.println("Number entered is Zero");
}
}
