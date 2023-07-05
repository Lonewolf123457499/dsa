package Bruhhh;

import java.util.HashSet;

public class Hashing
{
    public static void main(String[] args) {
        HashSet<Integer>s=new HashSet<>();
        s.add(6);
        s.add(4);
        s.add(5);
        System.out.println(s);
        if(s.contains(10))
        {
            System.out.println("present");
        }
        else
        {
            System.out.println("not present in ");
        }
        s.remove(5);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
    }
}
