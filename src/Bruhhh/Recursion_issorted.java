package Bruhhh;

public class Recursion_issorted
{
    public static boolean is_sorted(int arr[],int si)
    {
        if(arr.length-1==si)
        {
            return true;
        }
        if(arr[si]>arr[si+1])
        {
            return false;
        }
        else
        {
            return is_sorted(arr,si+1);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(is_sorted(arr,0));
    }
}
