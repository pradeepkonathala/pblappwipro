package allassingm;

import java.util.Scanner;

public class as2_17 
{
   public static void main(String[] args) 
   {
	   Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       while(n!=0)
       {
    	   System.out.println(n%10);
    	   n=n/10;
       }
   }
}
