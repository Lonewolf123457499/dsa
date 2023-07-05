package hackerrank_solution;
// we have to find out the max count and min count
public class Breaking_record
{
    public static int[]  max_min(int arr[])
    {
        int maxcount=0;
        int mincount=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max)
            {
                max=arr[i];
                maxcount++;
            }
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                mincount++;
            }

        }
        int a[]=new int[2];
        a[0]=maxcount;
        a[1]=mincount;
        return a;

    }

    public static void main(String[] args) {
        int arr[]={3,4,21,36,10,28,35,5,24,42};
        int a[]=max_min(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
