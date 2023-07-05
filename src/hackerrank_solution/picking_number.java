package hackerrank_solution;
/*
1 1 2 2 4 4 5 5 5
diff must be less than and equal to 1 between the two number
and the longest subarray havin
 */
public class picking_number
{
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 4, 4, 5, 5, 5};
        int count = 0;
        int min = 0;
        int arr2[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (Math.abs(arr[j] - arr[i]) <= 1)
                {
                    count++;
                }
            }
            arr2[i]=count;
            count=0;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
