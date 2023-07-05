package Bruhhh;

import java.util.Scanner;
public class searching_deletion_insertion_in_unsoreted_array
{
    static Scanner sc=new Scanner(System.in);
    public static int search(int arr[],int key)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void insertion()
    {
        System.out.println("enter the postion");
        int pos =sc.nextInt();
        System.out.println("enter the element");
        int element=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[20];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
            for(int j=n-1;j>=pos-1;j--)
            {
                arr[j+1] = arr[j ];
            }
            arr[pos-1]=element;
        n++;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args)
    {
        int arr[]={1,2,6,8,3,2,4};
        int pos=4;
        int z=search(arr,pos);
        System.out.println("the postion of an element is "+(z+1));
        insertion( );
    }
}
