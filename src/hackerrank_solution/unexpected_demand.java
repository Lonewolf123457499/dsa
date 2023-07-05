package hackerrank_solution;

public class unexpected_demand
{
    public static int demand(int arr[],int k)
    {
        boolean flag=false;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(k-arr[i]>=0)
            {
                count++;
                k=k-arr[i];
                flag=true;
            }
        }
        if(flag==true)
        {
            return count;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,6};
        System.out.println(demand(arr,3));
    }
}
