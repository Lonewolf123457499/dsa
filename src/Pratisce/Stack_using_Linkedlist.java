package Pratisce;

public class Stack_using_Linkedlist
{
    class  Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node top;
    // top is same as the head Node in the Linked list
    public  boolean isEmpty()
    {
        return top==null;
    }
    public void insert(int data) {
        Node node =new Node(data);
        if (top==null)
        {
            top=node;
            return;
        }
        node.next=top;
        top=node;
    }
    public int peek()
    {
        if(isEmpty())
            System.out.println("STACK IS EMPTY ");
        return top.data;
    }
    public int pop()
    {
        if (top==null)
        {
            return -1;
        }
        int poped= top.data;
        top=top.next;
        return  poped;
    }
    void display()
    {
        Node temp=top;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Stack_using_Linkedlist st=new Stack_using_Linkedlist();
        st.insert(10);
        st.insert(20);
        st.insert(30);
        st.insert(40);
        st.display();
        System.out.print(st.pop()+" ");
        System.out.println(st.pop()+" ");
        System.out.println(st.peek()+" ");
        //System.out.println( st.pop());
        st.insert(50);
        System.out.println(st.peek());
        st.display();
    }
}
