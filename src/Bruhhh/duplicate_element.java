package Bruhhh;

public class duplicate_element
{
//    public static void duplicate(int arr[])
//    {
//        int count=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]==arr[j]&&i!=j)
//                {
//                    count++;
//
//
//                }
//            }
//        }
//
//    }
//
    public static void sumpair(int arr[],int sum)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println(arr[i]+""+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,2,4,5};
        //duplicate(arr);
        sumpair(arr,5);
    }
}
