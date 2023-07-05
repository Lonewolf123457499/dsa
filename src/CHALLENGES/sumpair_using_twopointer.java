package CHALLENGES;

import java.util.Arrays;

// this program find the two sum pair using two pointer algorthim and also find the number of two sum pair exist in array.
public class sumpair_using_twopointer {
    public static void  sumpair(int arr[], int sum)
    {
        int i=0;
        int count=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==sum)
            {
                count++;
                System.out.println(arr[i]+","+arr[j]);
            }
            if(arr[i]+arr[j]<sum)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args)
    {
        int arr[]={48,24 ,99, 51, 33, 39, 29, 83, 74, 72, 22, 46, 40, 51, 67, 37, 78, 76, 26, 28, 76, 25, 10, 65, 64,47, 34, 88, 26, 49, 86, 73, 73, 36, 75, 5, 26, 4 ,39 ,99 ,27 ,12 ,97 ,67 ,63 ,15 ,3, 92 ,90};
        int sum=50;
        Arrays.sort(arr);
        sumpair(arr,sum);
    }
}
