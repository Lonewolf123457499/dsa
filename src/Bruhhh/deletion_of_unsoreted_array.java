package Bruhhh;

public class deletion_of_unsoreted_array
{
    public static int key(int arr[],int n,int pos)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==pos)
            {
                return i;
            }
        }
        return -1;
    }
    public static int deletion(int arr[],int n,int pos)
    {
        int position=key(arr,n,pos);
        if(position==-1)
        {
            System.out.println("index does not exist");
            return n;
        }
        int i;
        for(i=position;i<n;i++)
        {
            arr[i]=arr[i+1];
        }
        return n--;
    }

    public static void main(String[] args)
    {
        int arr[]={10,20,50,60,40};
        int n=arr.length-1;
        int pos=50;
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n=deletion(arr,n,pos);
        for(int i=0;i<=n-1;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
