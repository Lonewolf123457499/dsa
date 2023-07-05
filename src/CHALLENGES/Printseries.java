package CHALLENGES;

import java.util.Scanner;

public class Printseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1");
        int n = sc.nextInt();
        int count=0;
        System.out.println("enter the number2");
        int n2 = sc.nextInt();
        for (int i = 1; ; i++) {
            int c = 3 * i + 2;
            if (c % n2 != 0)
            {
                    System.out.println(c);
                    count++;
            }
            if(count==n)
                break;
            }
        }
    }


