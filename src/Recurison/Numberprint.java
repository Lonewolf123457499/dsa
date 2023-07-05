package Recurison;

public class Numberprint
{
    public static void number(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        number(n-1);
        //number(n+1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        number(5);
    }
}
