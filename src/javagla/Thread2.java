package javagla;
public class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("thread operations");
        System.out.println("this thread task is done by "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread());
//        Thread.currentThread().setName("vedant");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);
        System.out.println(Thread.currentThread());
        System.out.println(" this thread is done by"+Thread.currentThread().getName());
        Thread2 th=new Thread2();
        th.start();
    }
}
