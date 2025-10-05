package Practice;
import java.util.Scanner;

public class Add_2Num {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.print("Enter 1st num:");
		int a=S.nextInt();
		
		System.out.print("Enter 2nd num:");
		int b=S.nextInt();
		
		System.out.println("Addition:"+(a+b));
	}
}
