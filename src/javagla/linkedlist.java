package javagla;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist
{
    public static void main(String[] args) {
        LinkedList<String>lst=new LinkedList<String>();
        lst.add("vedant");
        lst.add("sk");
        lst.add("dfds");
        ListIterator t=lst.listIterator(0);
        while(t.hasNext())
        {
            System.out.println(t.next());
        }
    }
    }

