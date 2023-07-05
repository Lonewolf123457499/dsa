package CHALLENGES;

import java.util.Scanner;

public class Count
{
    public static  int Counter(int n,int digit)
    {
        int count=0;
        while(n>0)
        {
            int d=n%10;
            if(d==digit)
            {
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int digit=sc.nextInt();
        System.out.println(Counter(num,digit));
    }
}
