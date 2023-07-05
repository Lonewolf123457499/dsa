package CHALLENGES;

public class frequency
{
    public static void main(String[] args) {
        int arr[]={2, 2,3,3,3,4,4,4};
        int freq[]={0,};
        int count;
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=-1;
                }
            }
            if(arr[i]!=-1)
            {
                freq[i]=count;
            }
            System.out.println(arr[i]+""+freq[i]);
        }
    }
}
