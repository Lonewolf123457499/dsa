package CHALLENGES;

public class Frq {
    public static void Unique(int arr[])
    {
        int freq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0;i< freq.length;i++)
        {

            System.out.println(freq[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5};
        Unique(arr);
    }
}
