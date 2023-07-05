package Bruhhh;

import java.util.Scanner;

public class lower_and_boundary
{
    public static  int lower_bound(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return  ans;
    }
    public static int upperbound(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        while(t-->0)
        {
            int data=sc.nextInt();
            System.out.print(lower_bound(arr,data)+" ");
            System.out.print(upperbound(arr,data));
        }
    }
}
