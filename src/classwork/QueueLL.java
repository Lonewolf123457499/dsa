package classwork;

public class QueueLL
{
    static class Node
    {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

     Node head;
     Node tail;
    public  boolean isEmpty()
    {
        return head==null&& tail==null;
    }

    public  void add(int data) {
//        if (isEmpty())
//        {
//            System.out.println("Queue is Empty");
//            return;
//        }
        Node node =new Node(data);
        if (head==null)
        {
            head=node;
            tail=node;
        }
        tail.next=node;
        tail=node;
    }
    public   int remove()
    {
        if (isEmpty())
        {
            System.out.println("Empty queue");
            return -1;
        }
        int front= head.data;
        if (head==tail)
        {
            tail=null;
            head=null;
        }
        else {
            head=head.next;
        }
        return front;

    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print("|"+temp.data+"|"+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.remove();
       // q.remove();
        q.display();

    }

}
