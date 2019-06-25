package allassingm;

import java.util.Scanner;

public class as24 
{
  public static void main(String args[])
  {
	 char a,b;
	 Scanner c=new Scanner(System.in);
	 a= c.next().charAt(0);
	 b= c.next().charAt(0);
	 if(a<b)
	 {
		 System.out.println(a+" "+b);
	 }
	 else
	 {
		 System.out.println(b+","+a);
	 }
  }
}
