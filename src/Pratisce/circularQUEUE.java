package Pratisce;

public class circularQUEUE
{
    private int arr[];
    int size;
    int front=0;
    int rear=0;
    public circularQUEUE(int size) {
        this.arr = new int[size];
    }
    public void  add(int item) {
        if (size == arr.length) {
            System.out.println("Queue is full");
        }
        this.arr[rear++] = item;
        rear = rear % arr.length;
        size++;
    }
    public  int remove()
    {
        if (size==0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int poped=arr[front++];
        front=front% arr.length;
        size--;
        return  poped;
    }

    public static void main(String[] args) {
        circularQUEUE qc=new circularQUEUE(5);
        qc.add(10);
        qc.add(20);
        qc.add(30);
        qc.add(40);
        qc.add(50);
        qc.add(100);
        qc.add(200);
        qc.add(300);
        System.out.println(qc.remove());
        System.out.println(qc.remove());
        System.out.println(qc.remove());
        System.out.println(qc.remove());
    }


}
