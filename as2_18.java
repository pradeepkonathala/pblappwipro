package allassingm;

import java.util.Scanner;

public class as2_18 
{
 public static void main(String[] args)
 {
	 int t,x,s=0;
	 Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 t=n;
	 while(n>0)
	 {
		 x=n%10;
		 s=(s*10)+x;
		 n=n/10;
	 }
    if(t==s)
     {
	     System.out.println("is palindromr");
     }
    else
    {
    	System.out.println("notapllindrome");
    }
}
}