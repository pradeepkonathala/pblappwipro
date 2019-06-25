package allassingm;

import java.util.Scanner;

public class as2_14 
{
  public static void main(String[] args)
  {
	  Scanner in=new Scanner(System.in);
	  int a=in.nextInt();
	  int f=0;
	  if(a==0 || a==1)
	  {
		  System.out.println(a+"is neither prime nor composite");
	  }
	  else if(a>1)
	  {
		  for(int i=1;i<=a;i++)
		  {
			  for(int j=2;j<=i/2;j++)
			  {
				  if(i%j==0)
				  {
					  f=0;
					  break;
				  }
				  else
				  {
					  f=1;
				  }
			  }
			  if(f==1)
			  {
				  System.out.println(a+"is a prime number");
			  }
			  else
			  {
				  System.out.println(a+"is not aprimt number");
			  }
		  }
	  }
  }
}
