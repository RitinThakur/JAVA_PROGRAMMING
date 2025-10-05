package pattern;

public class P43 {
public static void main(String[] args) {
	int n=20;
	for(int i=0;i<5;i++)
	{
		//J
		for(int j=0;j<n;j++) 
		{
			if((i==0 && (j==0 || j==1 || j==2 || j==3 || j==4 || j==6 || j==7 || j==8 || j==10 || j==14 || j==16 || j==17 || j==18))) 
			{
				System.out.print("*");
			}
			else if( (i==1 && (j==2 || j==5 || j==9 || j==10 || j==14 || j==15 || j==19)))
			{
				System.out.print("*");	
			}
			else if((i==2 && (j==2 || j==5 || j==6 || j==7 || j==8 || j==9 || j==10 || j==14 || j==15 || j==16 || j==17 || j==18 || j==19)))
			{
				System.out.print("*");
			}
			else if(i==3 && (j==2 || j==5 || j==9 || j==11 || j==13 || j==15 || j==19))
			{
				System.out.print("*");
			}
			else if(i==4 && (j==0 || j==1 || j==2 || j==5 || j==9 || j==12 || j==15 || j==19))
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		
//		for(int j=7;j<11;j++)
//		{
//			int n=11;
//			if(i==0 || j==0 || i==n/2 ||j<=n-1 && j==n-1 && i<=n-1)
//			{
//				System.out.print("*");
//			}
//			else
//				System.out.print(" ");
//		}
		System.out.println();
		//J
	}
//		System.out.println();
//		for(int i=0;i<5;i++)
//		{
//		//A
//		for(int j=0;j<n;j++)
//		{
//			if((i==0 && (j==1 || j==2 || j==3)) || (i==1 && (j==0 || j==4)) || (i==2) || (i==3 && (j==0 || j==4)) || (i==4 && (j==0 || j==4)))
//			{
//				System.out.print("*");
//			}
//			else
//				System.out.print(" ");
//		}
//		System.out.println();
//		//A
//		}
//		System.out.println();
//		//V
//		for(int i=0;i<5;i++)
//		{
//		for(int j=0;j<n;j++)
//		{
//			if((i==0 && (j==0 || j==4))|| (i==1 && (j==0 || j==4)) || (i==2 && (j==0 || j==4)) ||(i==3 && (j==1 || j==3))|| (i==4 && j==2))
//			{
//				System.out.print("*");
//			}
//						else
//				System.out.print("  ");
//		}
//		System.out.println();
//		//V
//		}
//		for(int i=0;i<5;i++)
//		{
//		
//		//A
//		for(int j=0;j<n;j++)
//		{
//			if((i==0 && (j==1 || j==2 || j==3)) || (i==1 && (j==0 || j==4)) || (i==2) || (i==3 && (j==0 || j==4)) || (i==4 && (j==0 || j==4)))
//			{
//				System.out.print("*");
//			}
//			else
//				System.out.print(" ");
//		}
//		System.out.println();
//		//A
//		}
//	}
}
}

