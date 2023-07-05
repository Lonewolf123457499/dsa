package classwork;

public class Custom_Queue
{
    int rear=0;
   final static int defautl_capacity=10;
     private int arr[];
    Custom_Queue()
    {
        this(defautl_capacity);
    }
    Custom_Queue(int size)
    {
        this.arr=new int[size];
    }
    public boolean isEmpty()
    {
        return  rear==0;
    }
    public boolean isFull()
    {
        return  arr.length==rear;
    }
    public boolean add(int data) throws Exception
    {
        if(isFull())
        {
           // throw new Exception("Stack is Overflow");
            System.out.println("stack is overflow");
        }
        arr[rear++]=data;
        return  true;
    }
    public int remove() throws  Exception
    {
        if(isEmpty())
        {
            //throw new Exception("Queue is underflow");
            System.out.println("Queue is underflow");
        }
        int front=arr[0];
        for (int i=1;i<rear;i++)
        {
            arr[i-1]=arr[i];
        }
        rear--;
        return front;
    }
    public int front() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Queue is underflow");
        }
        int front=arr[0];
        return front;
    }
    public void display()
    {
        for (int i=0;i<rear;i++)
        {
            System.out.print("|"+arr[i]+"|");
        }
      //  System.out.println("END");
    }

    public static void main(String[] args) throws Exception
    {
        Custom_Queue queue=new Custom_Queue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        //queue.add(60);
     queue.remove();
     queue.remove();
     queue.remove();
     queue.remove();
        //queue.remove();
        queue.add(100);
        queue.add(200);
        System.out.println(queue.front());
        queue.display();
    }
}
