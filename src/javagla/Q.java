package javagla;

public class Q extends Thread
{
   public  void run()
    {
        System.out.println("you are in run method");
    }

    public static void main(String[] args) {
        Q r=new Q();
        r.start();
    }

}
