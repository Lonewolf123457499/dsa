package ALGO;

public class Moore_s_voting
{
    public static void mvoting(int arr[])
    {
        int ansindex=0;
        int count=1;
        for( int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[ansindex])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                ansindex=i;
                count=1;
            }
        }
        int mcount=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==arr[ansindex])
            {
               mcount ++;
            }
        }
        if(mcount> arr.length/2)
        {
            System.out.println("majority element is"+arr[ansindex]);
        }
        else
        {
            System.out.println("no majority element is present ");
        }
        System.out.println(arr[ansindex]+ "  ----->>>"+mcount);

    }

    public static void main(String[] args)
    {
        int arr[]={};
        mvoting(arr);
    }

}
