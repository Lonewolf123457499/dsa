package Bruhhh;

public class maximum_subarray_sum
{
    public static int subarraysum(int arr[])
    {
        int max=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
   return max;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        int t=subarraysum(arr);
        System.out.println(t);

    }
}
