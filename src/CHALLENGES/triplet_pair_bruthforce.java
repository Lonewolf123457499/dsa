package CHALLENGES;

import java.util.Arrays;

public class triplet_pair_bruthforce
{
    public static  void triplet(int arr[],int sum)
    {
        for(int i=0;i<=arr.length-3;i++)
        {
            for(int j=i+1;j<=arr.length-2;j++)
            {
                for(int k=j+1;k<=arr.length-1;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                    {
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int sum=10;
        int arr[]={5 ,7,9,1,2,4,6,8,3};
        Arrays.sort(arr);
        triplet(arr,sum);
    }
}
