package allassingm;

import java.util.Scanner;

public class as2_19 
{
  public static void main(String[] args)
  {
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int i=1;
	  int c=0;
	  while(c<n)
	  {
		  if((i%2==0) && (i%3==0) &&(i%5==0))
		  {
			  System.out.println(i);
			  c=c+1;
		  }
		  i=i+1;
	  }
  }
}
