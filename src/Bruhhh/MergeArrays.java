package Bruhhh;

import java.util.ArrayList;

public class MergeArrays
{
    public static void mergeTwoArrays(int arr1[],int arr2[])
    {
        ArrayList<Integer>list =new ArrayList<>();
      //  ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i!=arr1.length && j!=arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                list.add(arr1[i]);
                i++;
            }
            else
            {
                list.add(arr2[j]);
                j++;
            }
        }
        if(i==arr1.length)
        {
            while(j!= arr2.length)
            {
                list.add(arr2[j]);
                j++;
            }
        }
        if(j==arr2.length)
        {
            while(i!=arr1.length)
            {
                list.add(arr1[i]);
                i++;
            }
        }
        for (int k:list)
        {
            System.out.print(k+" ");
        }


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,10,11};
        int arr1[]={2,5,6,7,8,9};
        mergeTwoArrays(arr,arr1);
    }
}
