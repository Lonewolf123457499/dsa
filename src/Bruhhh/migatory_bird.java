package Bruhhh;

public class migatory_bird
{
    public static void migartory(int arr[])
    {
        int freq[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            int index=arr[i];
            freq[index]++;

        }
        int maxfreq=freq[1];
        int maxord=arr[1];
        for(int i=1;i<6;i++)
        {
            if(freq[i]>maxfreq)
            {
                maxord=i;
                maxfreq=freq[i];
            }
        }
        System.out.println(" max order is frequency "+maxord);
    }

    public static void main(String[] args) {
        int arr[]={2,2,3,5,4,2,3,1};
        migartory(arr);
    }
}
