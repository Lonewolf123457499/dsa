package javagla;
public class Task extends Thread
{
    public  void run()
    {
        System.out.println("playing music");
    }
// performing  single task using single thread
//    public static void main(String[] args) // by default thread provided by the JVM.
//    {
//        Task  t1= new Task();
//        t1.start();
    }
    // 2. performing single task using multiple threading
//class task2
//{
//    public static void main(String[] args) {
//        Task t1=new Task();
//        t1.start();
//        Task t2=new Task();
//        t2.start();
//        Task t3=new Task();
//        t3.start();
//    }
//}
// 3 . performing multiple  task using single threading is not posssible
// we have a media player which can play music , video and me do some kind of editing so we cannot do such thing in  a single time.


// 4. performing multiple task using multiple threading
class Task2 extends Thread
{
    public void run()
    {
        System.out.println("playing video");
    }
}
class Task3 extends Thread
{
    public void run()
    {
        System.out.println("programing in executing here");
    }

}
class Main_thread
{
    public static void main(String[] args)
    {
        Task thread1=new Task();
        thread1.start();
        Task2 thread2=new Task2();
        thread2.start();
        Task3  thread3=new Task3();
        thread3.start();

    }
}