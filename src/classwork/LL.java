package classwork;

import ALGO.Linkedllsit;

import javax.swing.*;
import java.util.HashSet;
import java.util.LinkedList;

public class LL
{
    class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public LL() {
    }

    public  Node head;
    int size=0;
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
    public void insertLast(int item)
    {
        Node temp=head;
        //create a new node
        Node node =new Node(item);
        if(head==null)
        {
            head=node;
            //insertFirst(item);
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        //Node temp2=temp;
        temp.next=node;
        node.next=null;
        size++;

    }
    public boolean hasItem(int item)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==item)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int FirstOccurence(int item)
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==item)
            {
                return  count;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }
    public int LastOccurence(int item)
    {
        int count=0;
        int lp=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==item)
            {
                lp=count;
            }

            temp=temp.next;
            count++;
        }
        if(lp>0)
            return lp;
        else {
            return -1;
        }
    }
    public Node getNode(int item)
    {
        Node temp =head;
        while (temp!=null)
        {
            if(temp.data==item)
            {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void insertAfterFirstOcc(int after,int value)
    {
        //create a new node
        if(getNode(after)==null)
        {
            System.out.println("not present");
            return;
        }
        Node node=new Node(value);
        Node temp2=null;
        if(head==null)
        {
            return;
        }
        Node temp=getNode(after);
        temp2=temp.next;
        temp.next=node;
        node.next=temp2;
    }
    void deleteHeadNode ()
    {
        if(head ==null)
        {
            return ;
        }
        Node temp=head;
        head=temp.next;
    }
    public void display()
    {
        Node temp=head;
       // while (temp.next!=null)
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        //System.out.println(temp.data);
       System.out.println(" END");
    }
    public Node getNode1(int index)
    {
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        for(int i=0;i<index-2;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void deleteAt( int index ) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
            return;
        }
//        if(head.next==null)
//        {
//            head=null;
//            return;

        if (index == 1) {
            deleteHeadNode();
        } else {

            Node temp = null;
            Node node = getNode1(index);
            temp = node.next.next;
            node.next = temp;

        }
    }
    public Node getPreviousNode(int item)
    {
            Node temp =head;
            Node prev=null;
            Node last=null;
            while (temp!=null)
            {
                if(temp.data==item)
                {
                    return prev;
                }
                prev=temp;
                temp=temp.next;
            }
            return null;
    }
    public void delete(int item)
    {
        Node dummy=head;
        if(dummy.data==item);
        {
            deleteHeadNode();
        }
        Node temp=getPreviousNode(item);
        if (temp!=null) {
            temp.next = temp.next.next;
        }
    }
    public  Node deleteOO(int data) {
        Node getPre = null;
        Node ans = null;
       if(head.next==null&&head.data==data)
       {
           return null;
        }
        if (head.data == data) {
            head = head.next;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                Node temp2 = getPre;
                temp2.next = temp2.next.next;
            }
            if (temp.data != data) {
                getPre = temp;
            }
            temp = temp.next;
        }
        return head;
    }

        public Node  reverseNode(Node head)
        {
            if(head==null)
            {
                return null;
            }
            Node prev = null;
            Node present = head;
            Node next = present.next;
            while (present != null) {
                present.next = prev;
                prev=present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }
            head=prev;
            return head;

        }
        public Node getMid()
        {
            Node fast=head;
            Node slow=head;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public boolean ispalindrome()
        {
            Node mid= getMid();
            Node secondHead=reverseNode(mid);
            Node reversehead=secondHead;
            while(head!=null&&secondHead!=null)
            {
                if(head.data!= secondHead.data)
                    break;
            }
            if(head==null||secondHead==null)
            {
                return true;
            }
            return  false;
        }
        // Reorder linked list
    public void Reoder()
    {
        if(head!=null||head.next!=null)
            return;
        Node hf=head;
        Node mid =getMid();
        Node hs=reverseNode(mid);
        Node temp=null;
        while(hf!=null &&hs!=null)
        {
            temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null)
        {
            hf.next=null;
        }
    }
    public Node getLastNth_Node(int n)
    {
        Node temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        Node prev=head;
        for(int i=1;i<=(size-n);i++)
        {
            if(i==(size-n))
            {
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }
    public Node  removeLastNthNode(int n)
    {
        Node temp2=head;
        if(n==size)
        {
            head=temp2.next;

        }
        else {
            Node temp = getLastNth_Node(n);
            temp.next = temp.next.next;
            return temp;
        }
        return null;


    }
    public void mergeTwo(LL first,LL second)
    {
        LL ans=new LL();
        Node f=first.head;
        Node s=second.head;
        Node Last=null;
        while (f.next!=null)
        {
            f=f.next;
            }
        f.next=s.next;
        while(s!=null)
        {
            s=s.next;
        }
    }
    public  Node  intersection(Node head1, Node head2)
    {
        Node pointer1=head1;
        Node pointer2 =head2;
        Node  dummyNode =new Node(0);
        Node temp=dummyNode;
        while(pointer1!=null && pointer2!=null)
        {
            if(pointer1.data==pointer2.data)
            {
                temp.next=new Node(pointer1.data);
                pointer1=pointer1.next;
                pointer2=pointer2.next;
                temp=temp.next;
            }
            else if(pointer1.data<pointer2.data)
            {
                pointer1=pointer1.next;
            }
            else
            {
                pointer2=pointer2.next;
            }
        }
        temp.next=null;
        dummyNode=dummyNode.next;
        return dummyNode;
    }
  public void deleteAllOccur(int item) {
      Node temp = head;
      Node getPre = null;
      Node ans = null;
      if (head.next == null && head.data == item) {
          head = null;
          return;
      }
      if (head.data == item) {
          head = head.next;
      }
      temp = head;
      Node temp2=null;
      while (temp != null) {
          if (temp.data == item)
          {
              if(temp2!=null) {
                  temp2 = getPre;
                  temp2.next = temp2.next.next;
              }
          }
          if (temp.data != item) {
              getPre = temp;
          }
          temp = temp.next;
      }
  }
//      public void deleteAllOccur(int item) {
//          Node getPre = null;
//          if (head.next == null && head.data == item) {
//              head = null;
//              return;
//          }
//          if (head.data == item) {
//              head = head.next;
//              getPre = head;
//              //head=null;
//          }
//          Node temp = head;
//          while (temp != null) {
//              if (temp.data == item) {
//                  if (getPre == null) {
//                      head = temp.next;
//                      temp = head;
//                      getPre = head;
//                  } else {
//                      Node temp2 = getPre;
//                      temp2.next = temp2.next.next;
//                      temp = temp2.next;
//                  }
//              } else {
//                  getPre = temp;
//                  temp = temp.next;
//              }
//          }
//      }

    public Node pairwiseSwap()
    {
        if(head==null|| head.next==null )
            return head;
        Node curr=head.next.next;
        Node prev=head;
        head=head.next;
        head.next=prev;
        prev.next=curr;
        while(curr!=null && curr.next!=null)
        {
            prev.next=curr.next;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr.next=next;
            prev=curr;
            curr=next;
        }
        return head;


    }
    public void intersectionLL(Node first, Node second)
    {
        Node temp=head.next;
        HashSet<Integer>hs=new HashSet<>();
        Node prev=head;
    }
    public boolean detectLoop()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public void removeDuplicateUnsorted()
    {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    public  Node unsortedDuplicate()
        // this code remove the duplicate element from the unsorted linked list using hashing techinque.
    {
        HashSet<Integer> set=new HashSet<>();
        Node curr=head.next;
        Node prev=head;
        while(curr!=null)
        {
            set.add(prev.data);
            if(set.contains(curr.data))
            {
                prev.next=curr.next;
            }
            else
            {
                prev=curr;
            }
            curr=curr.next;
        }
        return  head;
    }
    public void zigzag()
    {
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        // reverse  the 2 nd half of the linked list
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null&& right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;

        }

    }
    public int  Length(Node head)
    {
        if(head==null)
        {
            return -1;
        }
        Node temp=head;
        int lcount=0;
        while(temp!=null)
        {
            temp=temp.next;
            lcount++;
        }
        return lcount;
    }
    public int  intersectionOfTwoLL(Node head1, Node head2)
    {
        Node temp1=head1;
        Node temp2=head2;
        int extraNode=Math.abs(Length(head1)-Length(head2));
        if(Length(head1)<Length(head2))
        {
            for(int i=0;i<extraNode;i++)
            {
                temp2=temp2.next;
            }
        }
        else
        {
            for (int i=0;i<extraNode;i++)
            {
                temp1=temp1.next;
            }
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1.data;

    }
    // two pointer approach to get the nth node from the end of the Linked List.
    public void nthNodeFromLast(int k)
    {
        Node temp=head;
        Node nth=head;
        for(int i=0;i<k;i++)
        {
            nth=nth.next;
        }
        while(nth!=null)
        {
            temp=temp.next;
            nth=nth.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        LL l=new LL();
        Node head=null;
        l.insertLast(10);
       l.insertLast(20);
       l.insertLast(30);
       l.insertLast(40);
       l.insertLast(50);
       l.insertLast(60);
       // System.out.println(  l.detectLoop());
     l.display();
     // l.deleteAllOccur(60);
        //l.pairwiseSwap();
       // l.removeDuplicateUnsorted();
       // l.unsortedDuplicate();
//        int i=l.Length(l.head);
//        System.out.println(i);
       // l.nthNodeFromLast(1);
        l.delete(10);
      //  l.zigzag();
       // l.deleteOO(0);
       l.display();
    }
}
