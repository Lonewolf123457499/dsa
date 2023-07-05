package Pratisce;
import java.util.ArrayList;
import java.util.Stack;

public class Tree_intro
{
    static class Node
    {
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }

    public static void main(String[] args) {
        Node root=null;
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==-1)
            {
                st.pop();
            }
            else
            {
                Node node=new Node();
                node.data=arr[i];
                if (st.size()>0)
                {
                    st.peek().children.add(node);
                }
                else {
                    root=node;
                }
                st.push(node);
            }
        }
    }
}
