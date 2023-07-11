package Arrays;

public class Second_smallest
{
    public static int second(int arr[])
    {

        int s=arr[0];
        int ss=Integer.MAX_VALUE;;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<s)
            {
                ss=s;
                s=arr[i];
            }
            else if(arr[i]!=s&&arr[i]<ss)
            {
                ss=arr[i];
            }
        }


        return ss;
    }

    public static void main(String[] args) {
        System.out.println(second(new int[]{4,5,3,2,1}));
        System.out.println(second(new int[]{100,200,8000}));
        System.out.println(second(new int[]{4,87,32,10}));
        System.out.println(second(new int[]{4,5,3,2,1}));
    }
}

