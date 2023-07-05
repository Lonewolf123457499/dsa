package Bruhhh;

public class Recursion_firstindex
{
    public static  int firstindex(int arr[],int si,int data)
    {
        if(arr.length==si)
        {
            return -1;
        }
        if(arr[si]==data)
        {
            return si;
        }
        else
        {
            return firstindex(arr,si+1,data);
        }
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,2};
        System.out.println(firstindex(arr,0,2));
    }
}
