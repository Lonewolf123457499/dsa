package Bruhhh;

import java.util.Scanner;

public class deletion
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the position");
        int pos=sc.nextInt();
        for(int i=pos-1;i<=n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<=n-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
