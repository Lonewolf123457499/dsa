package ALGO;

public class Queue_Implementation
{
    int arr[];
    int rear=-1;
    int capacity;
    public Queue_Implementation(int n)
    {
        capacity=n;
        //System.out.println(capacity);
    }
    public boolean isEmpty()
    {
        if (rear==-1)
        {
            return true;
        }
        return false;
    }
    public void enqueue(int values) throws Exception
    {
        if(rear==arr.length-1)
        {
            throw new Exception("Queue overflow");
        }
        rear++;
        arr[rear]=values;
    }
    public int  dequeue() throws Exception
    {
        if(rear==-1)
        {
            throw new Exception("queue is underflow");
        }
        int data=arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear--;
        return data;
    }

    public static void main(String[] args) {
        Queue_Implementation q=new Queue_Implementation(5);
    }

    }

