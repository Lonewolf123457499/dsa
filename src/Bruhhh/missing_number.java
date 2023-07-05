package Bruhhh;

public class missing_number
{
    public static int missingnumber(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            sum=sum+arr[i];
        }
        return Math.abs(sum-(n*(n+1)/2));
    }

    public static void main(String[] args)
    {
        int arr[]={2,5,8,6,3,4,1,9,};
        int n=9;
        System.out.println(missingnumber(arr,n));

    }
}
