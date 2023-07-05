package classwork;

public class LL_p
{
    class Node
    {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }
    }
    private Node head;
    public void insertLast(int values)
    {
        Node node =new Node(values);
        if(head==null)
        {
            head=node;
            return;
        }
        Node temp=head;
        Node last=null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        last=temp;
        last.next=node;
        last=node;

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
    public void insertFirst(int data)
    {
        //create a new node
        Node node =new Node(data);
        Node temp=head;
        if(head==null)
        {
            head =node;
            return ;
        }
        node.next=head;
        head=node;

    }
    public Node  deleteFirst()
    {
        if(head.next==null) {
            head=null;
            return  head;
        }
        head=head.next;
        return  head;
    }
    public void deleteLast()
    {
        if(head.next==null)
        {
            head=null;
            return ;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public Node getNode(int index)
    {
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    // program to insert the data after the given Node .
    public Node getNodeAfter(int after)
    {
        if (head==null)
        {
            return null;
        }
        Node temp=head;
        Node temp2=null;
        while(temp!=null)
        {
            if (temp.data==after)
            {
                temp2=temp;
            }
            temp=temp.next;

        }
        return temp2;
    }
    // program to insert the Node after the given the index
    public void insertAfterData(int after,int data)
    {
        Node node =new Node(data);
        Node temp=getNodeAfter(after);
        Node temp2=temp.next;
        temp.next=node;
        node.next=temp2;
    }

   public void insertAt(int index,int data)
   {
       Node node =new Node(data);
       Node temp=getNode(index);
      Node temp2= temp.next;
      temp.next=node;
      node.next=temp2;
   }
   public Node  getPrevious(int before)
   {
       Node temp=head;
       Node prev=null;
       while(temp!=null)
       {
           if (temp.data==before)
           {
               return prev;
           }
           prev =temp;
           temp=temp.next;
       }
       return  null;
   }
   public void insertBefore (int before,int data)
   {
       Node node =new Node(data);
       if (before==head.data)
       {
           node.next=head;
           head=node;
           return;
       }
       Node temp=getPrevious(before);
       Node temp2=temp.next;
       temp.next=node;
       node.next=temp2;
   }
   // searching of first Occurence
public int getFirstOccruence(int data)
{
    Node temp=head;
    int count=0;
    while(temp!=null)
    {
        if(temp.data==data)
        {
            return  count;
        }
        temp=temp.next;
        count++;
    }
    return -1;
}
// searching of Last Occurence
    public int  getLastOccurence(int data)
    {
        Node temp=head;
        int last=0;
        int count=0;
        while(temp!=null)
        {
            if (temp.data==data)
            {

                last=count;
            }
            count++;
            temp=temp.next;
        }
        return last;
    }

    public static void main(String[] args) {
        LL_p l=new LL_p();
     l.insertLast(10);
     l.insertLast(20);
     l.insertLast(30);
     l.insertLast(10);
     l.insertLast(20);
        l.display();
//        l.deleteFirst();
//        l.deleteFirst();
//        l.deleteFirst();
       // l.deleteLast();
      //  l.insertAt(2,35);
       // l.insertAfter(10,35);
       // l.insertAfterData(40,25);
       // l.beforeInsert(20,15);
        //l.insertBefore(10,05);
     //   System.out.println(l.getFirstOccruence(50));
        System.out.println(l.getLastOccurence(10));
        l.display();
    }
}
