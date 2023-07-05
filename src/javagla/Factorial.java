package javagla;

public class Factorial
{
    public static  long factorial(long n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 1;
        }
        long fact=factorial(n-1);
        long fresult=n*fact;
        return fresult;

    }
    public static void nonzero(long n)
    {
        long number=factorial(n);
        while(number>0)
        {
            long d=number%10;
            number=number/10;
            if(d!=0)
            {
                System.out.println(d);
                break;
            }
        }
    }

    public static void main(String[] args) {
        nonzero(7);
    }
}
