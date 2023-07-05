package ALGO;

public class DDlinkedlist
{
    private  class Node
    {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }
    public Node head;
    public void addBegin(int item)
    {
        // create a new node
        Node node=new Node(item);

        node.next=head;
        node.previous=null;
       // if(head!=null) {
            //head.previous = node;
        //}
        if(head==null)
        {
            node.next=null;
            node.previous =null;
            head=node;
            return;

        }
        head.previous = node;
        head=node;

    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void addLast(int item)
    {
        // create a new node
        Node node=new Node(item);
        Node temp=head;
        if(head==null)
        {
//            node.previous=null;
//            head=node;
//            return;
            this.addBegin(item);
            //node.previous=null;
            head=node;
            return;
        }
            Node last = null;
            while (temp.next != null) {
                temp = temp.next;
            }
            last=temp;
            last.next = node;
            node.next = null;
            node.previous = last;
    }
    public Node getNode(Node head,int value)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void insertafter(int after,int value)
    {
        Node p=getNode(head,after);
        Node node=new Node(value);
        node.previous=null;

    }
    // DSA class work problem No- 2
    public void trainProblem(DDlinkedlist trainC ,DDlinkedlist trainD ,int item,int item2)
    {
        Node f=trainC.head;
       Node s=trainD.head;
        Node temp1=getNode(f,item);
        if(temp1==f)
        {
            trainC.head=f.next;
        }
        if(temp1.previous!=null) {
            temp1.previous.next = temp1.next;
            if(temp1.next!=null) {
                temp1.next.previous = temp1.previous;
            }
        }

        Node temp2=getNode(s,item2);
        if (temp2==s)
        {
            trainD.head=s.next;
        }
        if(temp2.previous!=null) {
            temp2.previous.next = temp2.next;
        }
        if (temp2.next!=null) {
            temp2.next.previous = temp2.previous;
        }
        // insertion part of train C
        Node lastC=null;
        while(f.next!=null)
        {
            f=f.next;
        }
        lastC=f;
        lastC.next=temp2;
        temp2.previous=lastC;
        temp2.next=null;
        // insertion part of train D
        Node lastD=null;
        Node t=trainD.head;
        while(t.next!=null) {
            t = t.next;
        }
        lastD=t;
        lastD.next=temp1;
        temp1.previous=lastD;
        temp1.next=null;

    }
}
