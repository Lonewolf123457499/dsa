package hackerrank_solution;

public class Angry_proffesor
{
    public static String angry_professor(int arr[],int k)//k is representing the threshold of the student
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=0)
            {
                count++;
            }
        }
        if(count<k)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        int arr[]={-2,-1,0,1,2};
        System.out.println(angry_professor(arr,3));
    }
}
