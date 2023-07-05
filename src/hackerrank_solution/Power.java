package hackerrank_solution;

public class Power
{
    public static double  power(int num, double x)
    {
        if(num==1)
            return x;
        double t=power(num-1,x);
        double pow= x*t;
        return pow ;
    }
    public static double inversePower(int num,int  x) {
        if(num==0)
        {
            return  1;
        }
      int p= (int) inversePower(num/2,x);
        int ln=p*p;
        if(num%2==1)
        {
            ln=p*x;
        }
        return ln;
    }

    public static void main(String[] args) {
        //System.out.println(power(3,2.10000));
        System.out.println(inversePower(2,5));
    }
}
