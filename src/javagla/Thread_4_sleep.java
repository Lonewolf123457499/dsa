package javagla;

public class Thread_4_sleep extends Thread
{
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                sleep(2000);
                if(i==5)
                {
                    interrupt();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(i);
//            try
//            {
//                Thread.sleep(1000);
//        }
//            catch (InterruptedException e)
//            {
//                System.out.println("Interrupted Error");
//            }
        Thread_4_sleep th=new Thread_4_sleep();
        th.start();
        Thread_4_sleep th2=new Thread_4_sleep();
        th2.start();
        Thread_4_sleep th1=new Thread_4_sleep();
        th1.start();


    }
    }

