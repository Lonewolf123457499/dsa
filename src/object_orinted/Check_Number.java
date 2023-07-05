package object_orinted;

import java.util.Scanner;

public class Check_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the person age");
        int age=sc.nextInt();
        int weight=sc.nextInt();
        if(age>18)
        {
            if(weight>50)
            {
                System.out.println("person is eligible for donating the blood");
            }
            else
            {
                System.out.println("the person is not eligible for donating the blood");
            }
        }
        else
        {
            System.out.println("age must be greater than 18");
        }
    }
}
