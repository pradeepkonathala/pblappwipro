package allassingm;

import java.util.Scanner;

class as2_4
{
    public static void main(String[] args)
    {   
        char a,b;
        Scanner c = new Scanner(System.in);
        a = c.next().charAt(0);
        b = c.next().charAt(0); 
        if(a<b) 
        System.out.print(a+","+b);
        else
        System.out.print(b+","+a);
    }
}	