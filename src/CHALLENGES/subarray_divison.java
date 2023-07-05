package CHALLENGES;

public class subarray_divison
{
    public static  void  subarray(int arr[],int d,int m)
    {
        int count=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                if(arr[i]+arr[j]==d)
                {
                    count++;
                    flag=true;
                }
            }
        }
        if(flag==true)
        {
            System.out.println(count);
        }
    }

    public static void main(String[] args)
    {
        int arr[]={2,2,1,3,2};
        int d=4;
        int m=2;
        subarray(arr,d,m);
//        (subarray(arr,d));
//        {
//            System.out.println();
//        }

    }
}
