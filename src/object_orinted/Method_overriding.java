package object_orinted;

class A
{
    public int harry()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println(" iam method 2 of class A");
    }
}
class B extends A
{
    //@Override
    public void meth2()
    {
        System.out.println("I am the method of class B");
    }
}
public class Method_overriding
{
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();

    }

}
