package javagla;

public class Run extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
           //System.out.println(Thread.currentThread().getPriority());
        }
    }
}
    class  E extends Thread
    {
        public void run()
        {
            for(int i=1;i<5;i++)
            {
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+" "+i);
               // System.out.println(Thread.currentThread().getPriority());
            }
        }
    }
    class T extends Thread
    {
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName()+" "+i);
                try
                {
                    sleep(10000);

                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }
                //System.out.println(Thread.currentThread().getPriority());
            }
        }


    public static void main(String[] args)
    {
        Run t=new Run();
        t.start();

        E e=new E();
        e.start();

        T r=new T();
        r.start();
    }
    }

