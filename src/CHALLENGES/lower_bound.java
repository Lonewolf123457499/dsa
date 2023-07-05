package CHALLENGES;

// lower bound of a  sorted array
public class lower_bound
{
    public static  int lower_bound(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,3,4,5};
        System.out.println(lower_bound(arr,3));

    }
}
