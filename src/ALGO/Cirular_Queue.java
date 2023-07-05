package ALGO;

public class Cirular_Queue
{
    private int[] arr;
    private int cs;
    private int front;
    private int rear;
    private int ms;
    public static final int default_capacity=10;
    Cirular_Queue()
    {
        this(default_capacity);
    }
    Cirular_Queue(int capacity)
    {
        this.arr=new int [capacity];
        this.cs=0;
        this.front=0;
        this.rear=capacity-1;
    }
    public boolean isfull()
    {
        return this.cs==this.ms;
    }
    public boolean isEmpty()
    {
        return this.cs==0;
    }
    public  void enqueue(int value) {
        if (this.isfull())
        {
            this.rear=this.rear+1%this.arr.length;
            this.arr[this.rear]=value;
            this.cs=cs+1;

        }
    }
}
