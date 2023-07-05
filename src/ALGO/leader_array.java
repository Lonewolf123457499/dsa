package ALGO;

public class leader_array
{
    public static void main(String[] args)
    {
        int arr[]={16,17,4,3,5,2};
        int lastleader=arr[arr.length-1];
        System.out.println(lastleader);
        for(int i=arr.length-2;i>0;i--)
        {
            if(lastleader<arr[i])
            {
                lastleader=arr[i];
                System.out.println(lastleader);
            }
        }
    }
}
