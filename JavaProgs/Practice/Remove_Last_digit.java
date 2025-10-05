package Practice;
import java.util.Scanner;

public class Remove_Last_digit {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int n=p.nextInt();
	
	System.out.println("Number without Last digit is: "+(n/10));
	
}
}
