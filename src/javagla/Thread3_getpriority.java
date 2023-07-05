package javagla;

import ALGO.Threadjava;

public class Thread3_getpriority extends Thread
{
    public void run()
    {
        System.out.println("child thread priority"+Thread.currentThread().getPriority());
        System.out.println("child new thread priority"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args)
    {
        System.out.println("main thread priority"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        Thread.currentThread().setPriority(MIN_PRIORITY);
        Thread.currentThread().setPriority(NORM_PRIORITY);
        //Thread.currentThread().setPriority(11); it will cause an Exception known as illegal argument Exception.
        System.out.println("main thread new priority+" +Thread.currentThread().getPriority());
        Thread3_getpriority t=new Thread3_getpriority();
        t.setPriority(3);
        t.start();

    }
}
