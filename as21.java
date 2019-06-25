package allassingm;

import java.util.Scanner;

public class as21 
{
   public static void main(String args[])
   {
	Scanner in=new Scanner(System.in);
	int n1=in.nextInt();
	if(n1>0)
	{
		System.out.println("positivie");
	}
	else if(n1<0)
	{
		System.out.println("negitive");
	}
	else
	{
		System.out.println("zero");
	}
   }
}
