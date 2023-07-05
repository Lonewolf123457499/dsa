package CHALLENGES;

import java.util.ArrayList;

public class Shape
{
    public static ArrayList<Integer> duplicate(int arr[]) {
        boolean flag=false;
        int freq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==1)
            {
                flag =true;
                list.add(-1);
            }
        }
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<freq.length;i++)
            if(freq[i]>=2)
            {
                list2.add(i);
            }
        if(flag)
        {
            return list;
        }
        else
        {
            return list2;
        }

    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        System.out.println(duplicate(arr));
    }
}
