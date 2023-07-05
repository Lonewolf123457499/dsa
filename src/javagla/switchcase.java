package javagla;

import java.util.Scanner;

public class switchcase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of A And B");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int opt=sc.nextInt();
        switch (opt)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);break;
            case 3:
                System.out.println(a*b);break;
            case 4:
                System.out.println(a/b);break;
        }

    }
}

