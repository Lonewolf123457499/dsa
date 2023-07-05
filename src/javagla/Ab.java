package javagla;

interface  Sum
{
    void m1();
    void m2();
}
abstract class Num implements Sum
{
   public  void m1()
    {
        System.out.println(" this is method m1");
    }
}
abstract class Num2 extends  Num
{
   public void m2()
    {
        System.out.println(" this is method belong to m2");
    }
}
public class Ab extends Num2
{
    public static void main(String[] args) {
        Ab t=new Ab();
        t.m2();
        t.m1();
    }
}
