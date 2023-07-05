package javagla;

import  java.io.*;
import java.util.*;
public class Threadd {
    public static void main(String[] args) {
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount : ");
        amount = sc.nextInt();
        if (amount >= 20000) {
            System.out.println("Net amount is " + (amount - ((amount * 10) / 100)));
        }
        if (amount >= 10000 && amount < 20000) {
            System.out.println("Net amount is : " + (amount - ((amount * 5) / 100)));
        }
        if (amount >= 5000 && amount < 10000) {
            System.out.println("Net amount is : " + (amount - ((amount * 2) / 100)));
        }
        if (amount < 5000) {
            System.out.println("net amount is : " + amount + "no discount will be given for the shopping under 5000");
        }
    }
}

