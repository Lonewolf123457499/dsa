package CHALLENGES;

import java.util.Scanner;

public class insertion_sort
{
    public static  int[] insertion(int arr[])
    {
        for(int i=1;i<arr.length-1;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arr2[]=insertion(arr);
        for(int i=0;i<= arr.length-1;i++)
        {
            System.out.println(arr2[i]);
        }

    }
}
