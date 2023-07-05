package classwork;

import ALGO.Linkedllsit;

import java.util.Stack;

// palindrome linked list using stack
public class palindrome_linked
{
    private class Node
    {
        Node next;
        int  data;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    public void insertFirst(int item)
    {
        // create a new node
        Node node=new Node(item);
        Node temp=head;
        if(head==null)
        {
            head=node;
            return ;
        }
        node.next=temp;
        head=node;

    }
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
        // System.out.println("----------------------------------------");
    }
    public boolean isPalindrome()
    {
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        Node slow=head;
        boolean flag=false;
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        while(slow!=null)
        {
            if (slow.data==st.pop())
            {
                flag =true;
            }
            slow=slow.next;
        }
        if (flag==true)
            return true;
        else
            return  false;
    }

    public static void main(String[] args) {
        palindrome_linked t=new palindrome_linked();
        t.insertFirst(10);
        t.insertFirst(20);
        t.insertFirst(40);
        t.insertFirst(200);
        t.insertFirst(10);
        t.display();
        System.out.println(t.isPalindrome());
    }

}
