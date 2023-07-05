package ALGO;

public class Boolean_check
{
    public static int duplicatecheck()
    {
        int arr[]={1,2,2};
        int count=1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            if(arr[low]==arr[high])
            {
                return count;
            }
            if(arr[low]!=arr[high])
            {
                if(arr[low]>arr[high])
                {
                    low++;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        System.out.println(duplicatecheck());
    }
}
