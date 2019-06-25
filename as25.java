package allassingm;
import java.lang.*;
import java.util.Scanner;

public class as25 
{
    public static void main(String args[])
    {
    	Scanner c=new Scanner(System.in);
    	char a=c.next().charAt(0);
    	if(a>=65 && a<=90)
    	{
    		System.out.println("Alphabet");
    	}
    	else if(a>=97 && a<=122)
    	{
    		System.out.println("Alphabet");
    	}
    	else if(a>=48 && a<=57)
    	{
    		System.out.println("Digit");
    	}
    	else
    	{
    		System.out.println("Special Character");
    	}
    }
}
