package CHALLENGES;

import java.util.Scanner;

public class Binary_search
{
    public static int binarySearch(int arr[],int item)
    {
        int low=0;
        int high=arr.length-1;
        for(int i=low;i<high;i++)
        {
            int mid=(low+high)/2;
            if(arr[mid]<item)
            {
                low=mid+1;
            }
            else if(arr[mid]>item)
            {
                high=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the array element at index "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int item=sc.nextInt();
        System.out.println(binarySearch(arr,item));


    }
}
