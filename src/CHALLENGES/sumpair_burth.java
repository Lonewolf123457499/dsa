package CHALLENGES;

import java.util.Scanner;

public class sumpair_burth
{
    public static boolean sumpair(int arr[],int sum)
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println(arr[i]+","+arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the sum ");
        int sum=sc.nextInt();
        if(sumpair(arr,sum))
        {
            System.out.println("valid sum pair");
        }
    }
}
