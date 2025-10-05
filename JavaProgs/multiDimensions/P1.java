package multiDimensions;

public class P1 {
	public static void main(String[] args) {
		int  [] [] a= new int[4][3];
		System.out.println(a); //address of 2d array
		System.out.println(a.length); //total number of rows
		System.out.println(a[0]); //address of 1 row
		System.out.println(a[1]); //address of 2 row
		System.out.println(a[2]); // address of 3 row
		System.out.println(a[0].length); //total elements in row 1
		System.out.println(a[1].length); //total elements in row 2
		System.out.println(a[2].length); //total elements in row 3
	}
}
