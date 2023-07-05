package javagla;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinlkedList1
{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        for(int i=0;i<st.size();i++)
        {
            System.out.println(st.get(i));
        }
        for(int s:st)
        {
            System.out.println(s);
        }
    }
}
