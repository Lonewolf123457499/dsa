package hackerrank_solution;

import java.util.Iterator;
import java.util.Stack;

public class Reverse_stack
{
    public static void pushButtom(Stack<Integer>st,int data)
    {
        if(st.isEmpty())
        {
            st.push(data);
            return;
        }
        int top=st.pop();
        pushButtom(st,data);
        st.push(top);
    }
    public static  void reverse(Stack<Integer>st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int top=st.pop();
        reverse(st);
        pushButtom(st,top);
    }
    public static String reverseString(String str)
    {
        System.out.println();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
             char ch=str.charAt(i);
             st.push(ch);
        }
        StringBuilder sb=new StringBuilder("");
        while (!st.isEmpty())
        {
            sb.append(st.pop());
        }
       // System.out.println("--------------------------");
        return sb.toString();
    }
    public static boolean isPalindrome(String str)
    {
        System.out.println(str);
        System.out.println(reverseString(str));
        if (str.equals(reverseString(str)))
        {
            return  true;
        }
        return  false;
    }
    //public static void BubbleSort(int arr[])
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
       // tt("vedant");
//        Iterator it = st.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
//        System.out.println();
//       // pushButtom(st, 90);
//        reverse(st);
//        Iterator t = st.iterator();
//        while (t.hasNext()) {
//            System.out.print(t.next() + " ");
//        }
        //reverseString("hello world");
        System.out.println(  isPalindrome("mam"));
    }
}
