package classwork;

import ALGO.Customstack;

import java.util.Iterator;

public class Custom_Stack
{
   final static int default_capacity=10;
    int top=-1;
    public   int arr[];
    int max=0;
    public Custom_Stack(int size) {
        max=size;
        this.arr = new int[size];
    }
    public Custom_Stack()
    {
        this(default_capacity);
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
            return false;
    }
//    public boolean  isFull()
//    {
//        if(top==arr.length-1) {
//            System.out.println("stack is full");
//        }
//    }
    public void push(int item)
    {
         if(top== arr.length-1)
         {
             System.out.println(" stack is overflow");
             return ;
         }
         this.top++;
         this.arr[this.top]=item;
         return;
    }
    public int pop()
    {
        int removed =arr[top];
        top--;
        return  removed;
    }
    public void display()
    {

    }

    public static void main(String[] args) {
         Custom_Stack cs=new Custom_Stack(5);
         cs.push(10);
         cs.push(30);
         cs.push(40);
         cs.push(50);
         cs.push(60);
////        System.out.println(cs.pop());
////        System.out.println(cs.pop())
//        cs.pop();
//        cs.pop();
//        cs.pop();
////        System.out.println(cs.pop());
//        cs.display();
    }

}
