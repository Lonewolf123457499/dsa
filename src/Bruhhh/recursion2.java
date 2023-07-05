package Bruhhh;

public class recursion2
{
    public static void pdskip(int n)
    {

        if(n==0)
        {
            return ;
        }
        pdskip(n-1);
        if(n%2==1)
        {
            System.out.println(n);
        }
        //pdskip(n-1);
    }

    public static void main(String[] args) {
        pdskip(10);
    }
}
