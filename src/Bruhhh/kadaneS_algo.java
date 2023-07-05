package Bruhhh;
// finding maximum sum by using kadane's algorithm..........
public class kadaneS_algo
{
    public static int maximum_Subarray(int arr[])
    {
        int max= Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            currsum+=arr[i];
            if(currsum>max)
            {
               max= currsum;
            }
            if(currsum<0)
            {
                currsum=0;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        System.out.println(maximum_Subarray(arr));

    }

}
