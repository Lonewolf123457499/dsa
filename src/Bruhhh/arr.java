package Bruhhh;

public class arr
{
    public static  int [] frequency(int arr[])
    {
        int freq[]={0};
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            count =1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=-1)
            {
                freq[i]=count;
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        {
            int arr[]={1,2,2,3,3,3,5,6,9,9};
            int arr1[]=frequency(arr);
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }

        }
    }
}
