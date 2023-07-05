package Recurison;

public class IsSorted
{
    public static boolean issorted(int []arr, int si)
    {
        if(si==arr.length-1)
        {
            return true;
        }
        if(arr[si]>arr[si+1])
        {
            return false;

        }
       boolean t= issorted(arr,si+1);
        return  t;

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,50};
        System.out.println(issorted(arr,0));
    }
}
