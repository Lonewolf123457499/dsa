package Bruhhh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class binary_serach
{
    public static int binary_serach(int arr[],int element)
    {
        int low=0;
        int high=arr.length;
        while(low<=high)
        {
            int mid=low+high/2;
            if(arr[mid]==element)
            {
                return mid;
            }
            else
                if(arr[mid]>low)
                {
                    low=low+1;
                }
                else
                    if(arr[mid]<high)
                    {
                        high=high-1;
                    }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int element=sc.nextInt();
        System.out.println(binary_serach(arr,element));

    }
}
