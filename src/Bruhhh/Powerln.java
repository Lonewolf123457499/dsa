package Bruhhh;

public class Powerln
{
    public static int power(int n,int r)
    {
        if(r==0)
        {
            return 1;
        }
        int pow=power(n,r-1);
        int ans=pow*n;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2,4));
    }

}
