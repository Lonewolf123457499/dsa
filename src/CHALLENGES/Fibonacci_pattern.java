package CHALLENGES;

import java.util.Scanner;

public class Fibonacci_pattern
{
    public static  int fib(int n)
    {
        if(n<1)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }




    public static void main(String[] args) {
        System.out.println( fib(4));

    }
    }

