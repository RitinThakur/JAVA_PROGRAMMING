package Practice;
import java.util.Scanner;

public class Student_Result {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter Physics Marks: ");
	int ph=p.nextInt();
	
	System.out.print("Enter Maths Marks: ");
	int m=p.nextInt();
	
	System.out.print("Enter Chemistry Marks: ");
	int c=p.nextInt();
	
	System.out.print("Enter Biology Marks: ");
	int b=p.nextInt();
	
	System.out.println();
	
	if(ph>=35 && m>=35 && c>=35 && b>=35)
	{
		int per=(ph+m+c+b)/4;
		if(per>85)
			System.out.println("Passed With Distinction");
		else if(per>=65 && per<=85)
			System.out.println("Passed With First Class");
		else if(per>=50 && per<65)
			System.out.println("Passed With Second Class");
		else
			System.out.println("Just Passed");
	}
	else
		System.out.println("Failed");
	
	
}
}
