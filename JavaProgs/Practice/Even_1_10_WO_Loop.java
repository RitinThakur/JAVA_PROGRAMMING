package Practice;

public class Even_1_10_WO_Loop {
public static void main(String[] args) {
	eNum(1);
}
public static void eNum(int n)
{
	if(n<=10)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
		eNum(n+1);
	}
}
}
