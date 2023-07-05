package Pratisce;

public class InsertionSort
{
    public  static int[] insertion_sort(int [] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&temp<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = insertion_sort(new int[]{5, 4, 10, 1, 6, 2});
        for (Integer i : arr
        ) {
            System.out.print(i + " ");


        }
    }
}
