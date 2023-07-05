package ALGO;

import classwork.LL_p;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedcoffient
{
    class Node
    {
        int data;
        int coff;
        Node next;
        public Node(int data, int coff) {
            this.data = data;
            this.coff = coff;
        }

    }

    private  Node head;
    public void insertFirst(int data,int coff)
    {
        //create a new node
        Node node=new Node(data, coff);
        Node temp=head;
        if(head==null)
        {
            head =node;
            return ;
        }
        node.next=head;
        head=node;
    }
    public  void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public  void sumLinkedList(Linkedcoffient first,Linkedcoffient second)
    {
        LinkedList<Integer>list=new LinkedList<>();
        Node temp1=first.head;
        Node temp2=second.head;
        while (temp1!=null&&temp2!=null)
        {
            if (temp1.coff== temp2.coff)
            {
                list.add(temp1.data+ temp2.data);
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        Iterator t=list.listIterator(0);
        while (t.hasNext())
        {
            System.out.print(t.next()+" ->");
        }
        System.out.println("END");
    }
    public  void sumPolynominal(Linkedcoffient first,Linkedcoffient second)
    {

    }

    public static void main(String[] args) {
        Linkedcoffient ll=new Linkedcoffient();
        ll.insertFirst(10,2);
        ll.insertFirst(20,1);
        ll.insertFirst(30,3);
        Linkedcoffient pp=new Linkedcoffient();
        pp.insertFirst(30,3);
        pp.insertFirst(10,2);
        pp.insertFirst(40,3);
       // pp.sumPolynominal(ll,pp);
        ll.display();
        pp.display();
        ll.sumPolynominal(ll,pp);
        //ll.sumLinkedList(ll,pp);
        //ll.display();
    }
}
