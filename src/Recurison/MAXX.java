package Recurison;

public class MAXX
{
    static int sum=0;
    public static void linearSearch(int arr[],int si,int data)
    {
        if(arr.length==si)
        {
            return ;
        }
        if(arr[si]==data)
        {
            System.out.println(si);
        }
         linearSearch(arr,si+1,data);
    }
    public static int LastIndex(int arr[],int si)
    {
        if(arr.length==si)
        {
            return -1;
        }
        int index=LastIndex(arr,si+1);
        return -1;
    }
    public static int sumArray(int arr[],int si)
    {
        //int sum=0;
        if(arr.length==si)
        {
            return sum ;
        }
        sum=sum+arr[si] ;
        sumArray(arr,si+1);
        return sum;
        }

    public static int  maxElement(int arr[], int si)
    {
        if(arr.length-1==si)
        {
            return arr[si];
        }
       int max= Math.max(arr[si],maxElement(arr, si+1));
        return max;

    }
    public static void main(String[] args) {
       System.out.println(maxElement(new int[]{50,70,60,30},0));
       // System.out.println(sumArray(new int []{1,2,3,4,5},0));
       //linearSearch(new int[]{1,8,9,8,8,2},0,8);

    }
}
