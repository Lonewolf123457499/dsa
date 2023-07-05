package Recurison;

public class TowerOFhanoi {
    public  static void tbh(int n,int source,int dest,int hepler)
    {
        if(n== 0)
        {
            return;
        }
        tbh(n-1,source,hepler,dest);
        System.out.println( n);
        tbh(n-1,hepler,dest,source);
    }

    public static void main(String[] args) {
        tbh(3,1,2,3);
    }

        }
