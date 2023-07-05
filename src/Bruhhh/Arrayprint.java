package Bruhhh;

// printing array using recursion
public class Arrayprint
{
    public static void display_array(int si,int arr[]) {
        if (si == arr.length)
            return;
        System.out.println(arr[si]);
        display_array(si+1,arr);
    }

    public static void main(String[] args) {
        int arr[]={10,40,30,50,60};
        display_array(0,arr);
    }
}
