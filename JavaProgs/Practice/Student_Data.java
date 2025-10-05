package Practice;

import java.util.Scanner;

public class Student_Data {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.print("Enter Student Name:");
		String n=S.nextLine();
		
		System.out.print("Enter Student Number:");
		long ph=S.nextLong();
		
		System.out.print("Enter Student age:");
		int a=S.nextInt();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Student Name:"+n);
		System.out.println("Student Phone Number:"+ph);
		System.out.println("Student Age:"+a);
		
		
		
	}
	
	
	

}
