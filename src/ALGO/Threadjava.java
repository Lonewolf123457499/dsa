package ALGO;

public class Threadjava extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(i);
        }
    }

}
class Threadmain
{
    public static void main(String[] args) {
        Threadjava t1 =new Threadjava();
        t1.start();
        Threadjava t2=new Threadjava();
        t2.start();

    }
}
