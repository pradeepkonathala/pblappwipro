package allassingm;

public class as23 
{
   public static void main(String args[])
   {
       int len=args.length;
       if(len==0)
       {
    	   System.out.println("No Values");
       }
       else
       {
    	   System.out.print(args[0]);
    	   for(int i=1;i<len;i++)
    		   System.out.println("," +args[1]);
    		   
       }
   }
}
