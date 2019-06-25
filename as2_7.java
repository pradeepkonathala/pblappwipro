package allassingm;
import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class as2_7 
{
  public static void main(String args[])
  {
	  Scanner in=new Scanner(System.in);
	  char a=in.next().charAt(0);
	  if(Character.isUpperCase(a))
	  {
		  System.out.println(Character.toLowerCase(a));
		  
	  }
	  else
	  {
		  System.out.println(Character.toUpperCase(a));
		  
	  }
	  
	  
  }
}
