package Bruhhh;

public class upper_bound_sortedarray
{
    public static  int upperbound(int arr[],int data)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==data)
            {
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<data)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,2,2,3,3,3,4,5};
        int data=2;
        System.out.println(upperbound(arr,data));

    }
}
