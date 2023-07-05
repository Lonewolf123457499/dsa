package javagla;

import java.util.Scanner;

public class Guess_Number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        int count=0;
        while(number<10)
        {
            count++;
            number--;
        }
        System.out.println(sum);

    }
}
