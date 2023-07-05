package classwork;

public class CircularQueue
{
    private  int arr[];
    int front=0;
    int rear=0;
    int size;
    final  static int default_capacity=10;
    CircularQueue()
    {
        this(default_capacity);
    }
    CircularQueue(int size)
    {
        this.arr=new int[size];
    }
    public boolean isFull()
    {
        return arr.length==size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean add(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return  false;
        }
        arr[rear++]=data;
        rear=rear%arr.length;
        size++;
        return  true;
    }
    public int remove() throws Exception {
        if (isEmpty() ) {
            throw new Exception("Queue is empty");
        }
        int removed=arr[front++];
        front=front%arr.length;
        size--;
        return  removed;
    }
    public int peek() throws  Exception
    {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
            return arr[front];
        }
        public void display()
        {
            if (isEmpty())
            {
                System.out.println("empty");
                return;
            }
            int i= front;
            do
                {
                    //int i=front;
                    System.out.print("|"+arr[i]+"|");
                    i++;
                    i=i%=arr.length;
                }
            while (i!=rear);

            }


    public static void main(String[] args) throws Exception
    {
        CircularQueue queue=new CircularQueue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        //System.out.println(queue.remove());
    queue.remove();
    queue.remove();
     queue.add(70);
     queue.add(80);
     queue.add(90);
     queue.display();
    }
    }

