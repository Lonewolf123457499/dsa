package CHALLENGES;

public class duplicate
{
    public static void main(String[] args) {
        int arr[]={1,2,1,2,3};
        int freq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            System.out.println(i+"----->>>"+freq[i]);
        }
    }
}
