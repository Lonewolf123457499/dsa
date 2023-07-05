package hackerrank_solution;

public class hurdle_race
{
public  static  int hurdlerace(int arr[],int k )
{
    int max=0;
    for(int i=0;i<arr.length;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    if(k>=max)
    {
        return 0;
    }
    else
    {
        return Math.abs(k-max);
    }
}

    public static void main(String[] args)
    {
        int arr[]={4,5,5,7,8,9,10};
        System.out.println(hurdlerace(arr,2));

    }
}
