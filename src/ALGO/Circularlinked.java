package ALGO;

public class Circularlinked
{
    private class Node
    {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }
    private  Node head;
    public void insertLast(int data)
    {
        // create a new node
        Node node=new Node(data);
        Node temp=head;
        if(head==null)
        {
            node.next=node;
            head=node;
            return ;
        }
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.next=head;
    }
    public void display()
    {
        Node temp=head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+"->>");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println("Head");
    }
    public void getNode(int item)
    {
        Node previous=null;
        Node temp=head;
        while(temp.next!=head)
        {
            if(temp.data==item)
            {
                previous=temp;
            }

        }
    }

    public static void main(String[] args) {
        Circularlinked c=new Circularlinked();
        c.insertLast(40);
        c.insertLast(50);
        c.insertLast(60);
        c.insertLast(70);
        c.display();
    }
}
