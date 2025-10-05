package Practice;
import java.util.Scanner;

public class Odd_Even_if_else {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	
	if(n%2==0)
		System.out.println(n+ " is Even");
	else
		System.out.println(n+" is odd");
}
}
