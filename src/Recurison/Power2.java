package Recurison;

public class Power2 {
    public static boolean powerOfTwo(int n)
    {
        if(n==0) return false;
        return ((n==1) || (n%2==1 && powerOfTwo(n/3)));
    }

    public static void main(String[] args) {
       // powerOfTwo(16);
        System.out.println(powerOfTwo(45));
    }
}
