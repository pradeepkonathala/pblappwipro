package allassingm;

import java.util.Scanner;

public class as2_13 
{
  public static void main(String[] args)
  {
	  int f=0;
	  Scanner in=new Scanner(System.in);
	  int a=in.nextInt();
	  int b=in.nextInt();
	  for(int i=a;i<=b;i++)
	  {
		  for(int j=2;j<i;j++)
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
			  System.out.println(i);
		  }
	  }
  }
}
