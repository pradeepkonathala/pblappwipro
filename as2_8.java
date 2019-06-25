package allassingm;

import java.util.Scanner;

public class as2_8 
{
   public static void main(String[] args)
   {
	 Scanner in=new Scanner(System.in);
	 char a=in.next().charAt(0);
	 if(a==82)
	 {
		 System.out.println("Red");
	 }
	 else if(a==66)
	 {
		 System.out.println("Blue");
	 }
	 else if(a==71)
	 {
		 System.out.println("Green");
	 }
	 else if(a==79)
	 {
		 System.out.println("Orange");
	 }
	 else if(a==89)
	 {
		 System.out.println("Yellow");
	 }
	 else if(a==87)
	 {
		 System.out.println("White");
	 }
	 else
	 {
		 System.out.println("Invalid");
	 }
   }
}
