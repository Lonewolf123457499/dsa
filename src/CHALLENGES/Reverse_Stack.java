package CHALLENGES;
import java.util.Stack;

public class Reverse_Stack
{
    public static void pushAtBottom(Stack<Integer> st,int data)
    {
        if(st.isEmpty())
        {
            st.push(data);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }
    public  static void dsiplay(Stack<Integer>st)
    {
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        dsiplay(st);
        pushAtBottom(st,90);
        System.out.println("-----------------");
        dsiplay(st);

    }
}
