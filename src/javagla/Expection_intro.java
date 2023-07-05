package javagla;

import java.util.Scanner;

public class Expection_intro
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        try {
            int c=a/b;
            System.out.println((int)c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("you must enter the vaild number");
            System.out.println(e);

        }
        catch (Exception e)
        {
            System.out.println("exception other than arthemtic excpetion");
        }
        finally {
            System.out.println(" you are in finally block");
        }
    }
}
