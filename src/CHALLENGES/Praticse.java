package CHALLENGES;

import java.util.Scanner;

public class Praticse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=(n+1)/2;i++)
        {
            for(int l=(n+1)/2;l>=i;l--)
            {
                System.out.print("*\t");
            }
            for(int space=0;space<=i;space++)
            {
                System.out.print(" \t");
            }
            for(int j=(n+1)/2;j>=i;j--)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i=1;i<=(n+1)/2;i++)
        {
            for(int l=1;l<=i;l++)
            {
                System.out.print("*\t");
            }
            for(int space=(n+1)/2;space>=i;space--)
            {
                System.out.print(" \t");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
