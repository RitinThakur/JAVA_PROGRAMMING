package Practice;
import java.util.Scanner;
public class Scanner_Methods {
	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
	
		System.out.print("Enter Byte: ");
		byte a=S.nextByte();
		
		System.out.print("Enter short: ");
		short b=S.nextShort();
		
		System.out.print("Enter Int: ");
		int c=S.nextInt();
		
		System.out.print("Enter Long: ");
		long d=S.nextLong();
		
		System.out.print("Enter float: ");
		float e=S.nextFloat();
		
		System.out.print("Enter double: ");
		double f=S.nextDouble();
		
		System.out.print("Enter Boolean: ");
		boolean g=S.nextBoolean();
		
		System.out.print("Enter String: ");
		String h=S.next();
		
		System.out.print("Enter String: ");
		String i=S.nextLine();
		
		System.out.print("Enter char: ");
		char j=S.next().charAt(0);
		
		System.out.print("Enter char: ");
		char k=S.nextLine().charAt(0);
	}
}
