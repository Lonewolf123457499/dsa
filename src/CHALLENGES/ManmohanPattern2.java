package CHALLENGES;

import java.util.Scanner;

public class ManmohanPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc=new Scanner(System.in);
        int k = 1;
//        int n = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; i++)
            {
                if(i==(i+j)-1)
                {
                    System.out.println(j-1);
                }

            }
            System.out.println();
        }
    }
}