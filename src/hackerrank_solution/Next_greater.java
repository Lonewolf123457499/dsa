package hackerrank_solution;

import java.util.Stack;

public class Next_greater
{
    public static void nextGreater(int arr[])
    {
        int next[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i= arr.length;i>0;i--)
        {
            if (st.isEmpty())
            {
                next[i]=-1;
            }
            st.push(i);
           // if(st.peek(arr[i]<))

        }
    }
}
