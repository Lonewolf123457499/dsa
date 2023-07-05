package CHALLENGES;

import java.util.Scanner;

public class Hollow_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=(n+1)/2;i++)
        {
            for(int j=(n+1)/2;j>=i;j--)
            {
                System.out.print("*");
            }
            for(int sp=2;sp<=i;sp++)
            {
                System.out.print(" \t");
            }
            for(int m=(n+1)/2;m>=i;m--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=2;k<=(n+1)/2;k++)
        {
            for(int l=1;l<=k;l++)
            {
                System.out.print("*");
            }
            for(int space=((n+1)/2)-1;space>=k;space--)
            {
                System.out.print(" \t");
            }
            for(int p=1;p<=k;p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
