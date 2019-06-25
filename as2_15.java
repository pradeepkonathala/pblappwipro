package allassingm;

import java.util.Scanner;

public class as2_15 
{
  public static void main(String[] args)
  {
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.println("* ");
    	  }
               
    	  System.out.println();
      }
      
  }
}
