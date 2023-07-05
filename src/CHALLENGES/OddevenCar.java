package CHALLENGES;
import javax.swing.*;
import java.util.Scanner;

public class OddevenCar
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test cases");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            System.out.println("check whether car can run");
            int n = sc.nextInt();
            int oddsum=0,evensum=0;
            while(n>0)
            {
                int d=n%10;
                if(d%2==0)
                {
                    evensum=evensum+d;
                }
                else
                {
                    oddsum=oddsum+d;
                }
                n=n/10;
            }
            if(evensum%4==0||oddsum%3==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
