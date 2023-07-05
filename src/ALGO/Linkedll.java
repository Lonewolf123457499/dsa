package ALGO;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        //this.next=next;
    }
}
public class Linkedll
{
    private  static Node head;
    private static Node tail;
   static  public Node addFirst(Node head,int item) {
       // create a new nod
       Node nn = new Node( item);
      //Node head;
       nn.next = head;
       return head;
   }
    static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ,");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head =null;
        head=addFirst(head,15);
        head=addFirst(head,30);
        head=addFirst(head,45);
        display(head);

    }
}

