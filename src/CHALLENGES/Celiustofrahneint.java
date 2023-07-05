package CHALLENGES;

import java.util.Scanner;

public class Celiustofrahneint
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("enter the minimum value");
        int min=sc.nextInt();
        System.out.println("enter the maximum value");
        int max= sc.nextInt();
        System.out.println("enter the increment ");
        int incre=sc.nextInt();
        int c=0;
        for( i=min;i<=max;i+=incre)
        {
            c=(i-32)*5/9;
            System.out.println(i+"\t"+c);
        }
    }
}
