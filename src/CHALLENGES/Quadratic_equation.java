package CHALLENGES;

import java.util.Scanner;

public class Quadratic_equation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=((int)Math.pow(b,2)-(4*a*c));
        if(d>0)
        {
            int t=(-b+(int)Math.sqrt(b*b-4*a*c))/2*a;
            int t2=(-b-(int)Math.sqrt(b*b-4*a*c))/2*a;
            System.out.println("Real and distinct");
            System.out.println(Math.min(t,t2)+" "+Math.max(t,t2));
        }
        if(d==0)
        {
            int t=(-b+(int)Math.sqrt(b*b-4*a*c))/2*a;
            //int t2=(-b-(int)Math.sqrt(b*b-4*a*c))/2*a;
            System.out.println("Real and Equal");
            System.out.println(t+" "+t);
        }
        if(d<0)
        {
            System.out.println(" Imaginary ");
        }



    }
}
