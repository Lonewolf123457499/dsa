package ALGO;

public class DoublyLinkedList
{


    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
    public Node head;
    public void insertFirst(int item)
    {
        // create a new node
        Node nn=new Node(item);
        nn.next=head;
        if(head!=null)
        {
            head.prev=nn;
            head.prev=null;
        }
        nn.prev=null;
        head=nn;

    }
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
    }
    public void addLast(int item)
    {
        Node last=head;
        // create a new node
        Node nn=new Node(item);
        if(head==null)
        {
            nn.prev=null;
            head=nn;
            return;
        }
        while(last.next!=null)
        {
            last=last.next;
        }
        nn.next=null;
        nn.prev=last;
        last.next=nn;

    }
}
