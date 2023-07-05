package CHALLENGES;

import java.util.*;

public class Arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.remove(1);
        System.out.println(list);

    }
}
