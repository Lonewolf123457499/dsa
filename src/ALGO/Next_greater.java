package ALGO;

import java.util.Stack;
// Next greater element using stack
public class Next_greater
{
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        // start traversing from the last and check for the greater element from it.
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i])
            {
                // empty the stack if the right element are smaller than the current element
                st.pop();
            }
            if (st.isEmpty())
            {
                nextGreater[i]= -1;
            }
            else
                nextGreater[i]=arr[st.peek()];
            st.push(i);
        }
        for (int i=0;i< nextGreater.length;i++)
        {
            System.out.println(nextGreater[i]);
        }
    }
}
