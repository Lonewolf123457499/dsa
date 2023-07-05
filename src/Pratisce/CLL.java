package Pratisce;
public class CLL
{
    class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }
    public  Node head;
   // private Node tail;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { // empty list case
            head = newNode;
            head.next = head; // point to itself
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }
    public void insertLast(int data)
    {
        Node node =new Node(data);
        while (head==null)
        {
            node.next=node;
            head=node;
            return;
        }
        Node last=null;
        Node temp=head;
        while (temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.next=head;
    }
    public void display() {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + "->>");
            temp = temp.next;
        }
        System.out.println("Head");
    }

    public static void main(String[] args) {
        CLL l=new CLL();

        l.addFirst(10);
        l.addFirst(20);;
        l.addFirst(30);
        l.addFirst(40);
        l.addFirst(50);
        l.display();
    }

}
