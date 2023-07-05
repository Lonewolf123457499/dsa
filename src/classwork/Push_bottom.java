package classwork;

import java.util.Iterator;
import java.util.Stack;

public class Push_bottom
{
    public static void pushBottom(Stack<Integer> stack,int data)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }
        int top=stack.pop();
        pushBottom(stack, data);
        stack.push(top);

    }
    public static void train4(Stack<Integer> st,int data)
    {
        if(st.peek()==data)
        {
            st.pop();
            System.out.println("compartment  "+data+" is detached for the train");
            return;
        }
        int top=st.pop();
        System.out.println("compartement  "+ top+" is detached from the train");
        train4(st, data);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int top=st.pop();
        reverseStack(st);
        pushBottom(st,top);
    }
    public static  void display( )
    {
        Stack<Integer> st=new Stack<>();
        Iterator l= st.iterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }
    }
    public static String reverseString(String str)
    {
        Stack<Character> st=new Stack<>();
        int index=0;
        while (index<str.length())
        {
             st.push(str.charAt(index));
             index++;
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty())
        {
            char ch=st.pop();
            sb.append(ch);
        }
         return  sb.toString();
    }
    // this function delete the stack middle element
   // public  static void delete(Stack<Integer> st,int size)

   //  static  int mid=(int)Math.ceil((st.siz+1)/2);
    public static void deleteStackMid( Stack<Integer> st, int mid)
    {
        //int mid=(int)Math.ceil((size+1)/2);
        if(st.peek() == st.get(mid))
        {
            st.pop();
            return;
        }
        int top=st.pop();
        deleteStackMid(st,mid);
        st.push(top);
    }
    public static void mid(Stack<Integer> st, int size)
    {
         int mid=(int)Math.ceil((size+1)/2);
         deleteStackMid(st ,mid);

    }
    public static void reverseWord(String s)
    {
    }
    public static void main(String[] args)
    {
        Stack<Integer> stack =new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
//        Iterator t= stack.iterator();
//        while(t.hasNext()) {
//            System.out.println(t.next());
//        }

//        Iterator k= stack.iterator();
//        while(k.hasNext())
//        {
//            System.out.println("compartment is linked is trainM"+k.next() );
//        }
//        mid(stack, stack.size());
//        //System.out.println((stack.size()+1)/2);
//        Iterator t1= stack.iterator();
//        while(t1.hasNext()) {
//            System.out.println(t1.next());
        System.out.println(reverseString("i.am.vedant.singh.chandel"));
        }

    }



