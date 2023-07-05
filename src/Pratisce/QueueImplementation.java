package Pratisce;

import java.util.Queue;

public class QueueImplementation
{
    private int arr[];
    int rear =0;
    public QueueImplementation(int size)
    {
        this.arr=new int[size];
    }
    public boolean isFull()
    {
        return rear==arr.length;
    }
    public boolean isEmpty()
    {
        if (rear==0)
            return  true;
        else  return  false;
    }
    public void push(int val)
    {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.arr[rear++]=val;
        return;
    }
    public  int  pop()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
        }
        int poped =arr[0];
        for (int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear--;
        return  poped;

    }
    public  void display()
    {
        for (int i=0;i<rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        QueueImplementation q=new QueueImplementation(5);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//
//        System.out.println(q.pop());
        q.push(50);
        q.push(60);
//        q.display();
//        System.out.println();
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        //q.display();
    }

}
