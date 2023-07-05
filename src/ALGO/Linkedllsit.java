package ALGO;

public class Linkedllsit {
    public class Node {
        int data;
        Node next;
    }

    public Node head;
    private Node tail;
    private int size;

    public void display(Node head) {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
       // System.out.println("----------------------------------------");
    }

    public void addLast(int items) {
        Node nn = new Node();
        nn.data = items;
        nn.next = null;
        if (this.size >= 1) {
            this.tail.next = nn;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            size++;
        }
    }

    public void addFirst(int item) {
        // create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        // attach
        if (this.size >= 1) {
            nn.next = head;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            size++;
        }
    }
    public void  countSize(Node head,int count)
    {
       // int count=0;
        if (head==tail)
        {
            System.out.println(1);
            return;
        }
        Node temp=head;
        if (temp==tail)
        {
            //System.out.println(count);
            return;
        }
        countSize(temp.next,++count);
        System.out.print(count);
    }

    public int getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("linked is empty");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (size == 0) {
            throw new Exception("linked is empty");
        }
        return tail.data;
    }

    public int getAt(int index) throws Exception {
        if (size == 0)
            throw new Exception(" Linkedlist is empty");
        if (index < 0 || index > size)
            throw new Exception("invalid index");
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    private Node getNodeAt(int index)  {
        if (size == 0)
            System.out.println("linked list is null");
        if (index < 0 || index > size)
            System.out.println("invalid index");
        Node temp = head;
        for (int i = 1; i < index-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void delete(int index)
    {
        Node nm1=getNodeAt(2);
        Node temp2=nm1.next.next;
        nm1.next=temp2;
        size--;
    }

    public void addAt(int index, int item) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("invalid index");
        }
        if (size == 0) {
            this.addFirst(item);
        } else if (size == 1) {
            this.addLast(item);
        } else {
            // create a new node
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            // attachment process
            Node nm1 = getNodeAt(index - 1);
            //  Node np1=nm1.next;
            Node np1 = getNodeAt(index);

            nm1.next = nn;
            nn.next = np1;

            // summary object
            size++;

        }
    }

    public int removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception(" Linked list is empty");
        }
        int rv = head.data;
        if (size == 1) {
            this.head = null;
            this.tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
        return rv;
    }

    public int removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("Linked list is empty");
        }
        int rv = tail.data;
        if (size == 1) {
            this.tail = null;
            this.head = null;
            this.size = 0;
        } else {
            Node nm1 = getNodeAt(size - 2);
            tail = nm1;
            tail.next = null;
            size--;
        }
        return rv;
    }

    //    public  int removeAt() throws Exception
//    {
//        if(size==0)
//        {
//            throw  new Exception("linked list is empty");
//        }
//       // if()
//
//    }
    public void reverseData() throws Exception {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            Node ln = getNodeAt(left);
            Node rn = getNodeAt(right);
            int temp = ln.data;
            ln.data = rn.data;
            rn.data = temp;
            left++;
            right--;
        }
    }

    public boolean search(int item) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == item) {
                return true;
            }
            temp = temp.next;
            count++;
        }
        return false;
    }


    //Remove duplicate element from sorted linked list
    public void removeduplicate() {
        Node node = head;
        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }

        }
        tail = node;
        tail.next = null;
    }

    // merge two sorted list
    public static Linkedllsit merge(Linkedllsit first, Linkedllsit second) {
        Node f = first.head;
        Node s = second.head;
        Linkedllsit ans = new Linkedllsit();
        while (f != null && s != null) {
            if (f.data < s.data) {
                ans.addLast(f.data);
                f = f.next;
            } else {
                ans.addLast(s.data);
                s = s.next;
            }
        }
        while (f != null) {
            ans.addLast(f.data);
            f = f.next;
        }
        while (s != null) {
            ans.addLast(s.data);
            s = s.next;
        }
        return ans;
    }

    public boolean hascycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public int cycle_length(Node head) {
        Node fast = head;
        Node slow = head;
        //int len;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                int len = 0;
                Node temp = slow;
                do {
                    temp = temp.next;
                    len++;
                }
                while (temp != fast);
                return len;
            }
        }
        return -1;
    }

    // leetcode linked list cycle problem Number 2
    public Node llCycle() {
        int length = 0;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                length = cycle_length(slow);
            }
        }
        //Find the start node
        Node f = head;
        Node s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
        // keeping moving both forward and they will ,et at a cycle
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // In place reversal  of LinkedList
    public Node reverse(Node head) {
        Node previous = null;
        Node present = head;
        Node next = present.next;
        if(head==null)
            return null;
        if(head.next==null)
        {
            return head;
        }
        while (present != null) {
            present.next = previous;
            previous = present;
            present = next;
            //  can give null pointer exception
            if (next != null) {
                next = next.next;
            }
           // return previous;
        }
        return  previous;
    }
    public Node getMidNode(Node head)
    {
        if(head==null||head.next==null)
        {
            return null;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalidrome()
    {
        Node mid =getMidNode(head);
       // reverse(mid);
        return false;
    }
    public Node reverseList(Node head)
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
    public boolean ispalindrome(Node head)
    {
        Node mid=getMidNode(head);
        Node secondhead=reverseList(mid);
        Node reversehead=secondhead;
        while(head!=null&&secondhead!=null)
        {
            if(head.data== secondhead.data)
            {
                break;
            }
            head=head.next;
            secondhead=secondhead.next;
        }
        reverseList(secondhead);
        if(head==null||secondhead==null)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args)  throws Exception
    {
        Linkedllsit ll=new Linkedllsit();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.reverseData();
        ll.display(ll.head);
        //System.out.println(ll.countSize(ll.head,0));
        //ll.countSize(ll.head, 1);
//        ll.addLast(30);
//        ll.addLast(20);
//        ll.addLast(10);
       // ll.display(ll.head);
       // System.out.println(ll.ispalindrome(ll.head));
       // ll.display(ll.head);
    }
}
