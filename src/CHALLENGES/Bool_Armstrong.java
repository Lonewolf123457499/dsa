package CHALLENGES;

import java.util.Scanner;

public class Bool_Armstrong
{
    public static boolean Armstrong(int n)
    {
        int num=n;
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        int copy=num;
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            sum += (int) Math.pow(d, count);
            num=num/10;
        }
        if(sum==copy)
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the test case");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("enter the number");
            int n = sc.nextInt();
            System.out.println(Armstrong(n));
        }
    }
}
