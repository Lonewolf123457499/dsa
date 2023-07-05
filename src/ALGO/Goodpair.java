package ALGO;

import java.util.ArrayList;

public class Goodpair
{
    public static int  goodpair(int nums[])
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;i<nums.length-1;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
        }
    }
        if(count>0)
    {
        return count;
    }
        else
    {
        return 0;
    }

}
public static void subArray(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
}
public static void SortedArray(int arr[])
{
    ArrayList<Integer> lt=new ArrayList<>();
    for(int i=0;i<=arr.length;i++) {
        try {
            if (arr[i] != arr[i + 1]) {
                lt.add(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {


        }
    }
    for(int i:lt)
    {
        System.out.println(i);
    }
}

    public static void main(String[] args) {
        int arr[]={ 1,1,1,2,2,3,3,4,4};
        //System.out.println( goodpair(arr));
       // subArray(arr);
        SortedArray(arr);

    }
}
