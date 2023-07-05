package Pratisce;

public class QLL
{
    class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
        //Node rear;
    }
    private Node rear;
    public void add(int item)
    {
        Node node=new Node(item);
        if (rear==null)
        {
            rear=node;
            return;
        }
        Node temp=rear;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
    }
    public int pop()
    {
        if (rear==null)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int poped=rear.data;
        rear=rear.next;
        return poped;
    }

    public static void main(String[] args) {
        QLL q=new QLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.pop();
        q.pop();
    }
}
