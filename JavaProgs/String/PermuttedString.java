package String;

public class PermuttedString {
public static void main(String[] args) {
	String str1="ABC";
	String str2="";
//	System.out.println(str1.substring(0,1));
//	System.out.println(str1.substring(1,2));
//	System.out.println(str1.substring(2,3));
		
	for(int i=0;i<str1.length();i++) {
		char ch=str1.charAt(i);
		str2=str1.substring(0,i)+str1.substring(i+1);
		System.out.println(str2);
	}
}
}
