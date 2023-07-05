package ALGO;

import java.io.IOException;

public class Customstack
{
    private int data[]=new int[5];
    private int default_capacity=10;
    private int top=-1;
    public int size()
    {
        return top+1;
    }

    public  void push(int value) throws Exception
    {
        if(top+1==data.length)
        {
            throw new Exception("stack is full");
        }
        top++;
        data[top]=value;
    }
    public int pop() throws Exception {
        if(top==-1)
        {
            throw new Exception("stack is empty");
        }
        int sv=this.data[this.top];
        this.data[this.top]=0;
        this.top--;
        return sv;
    }
    public void display()
    {
        for(int i= data.length;i>0;i--)
        {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
    }
}
