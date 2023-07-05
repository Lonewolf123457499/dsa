package Bruhhh;

public class recursion_1
{
    public static int stackdecreasing(int n)
    {
        if(n==0)
        {
            return 0;
        }
        System.out.println(n);
        return stackdecreasing(n - 1);
    }

    public static void main(String[] args) {
        stackdecreasing(5);
    }
}
