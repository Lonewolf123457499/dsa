package javagla;
public class A
{
    int val=20;
    public A()
    {
        this(10,20);
        System.out.println("THis is class A deafult constructor");
    }
    public A(int a,int b)
    {
        System.out.println(a+"----"+b);
        System.out.println("this is parametrized constructor");
    }
    public void display()
    {
        System.out.println("this method of A");
    }
}
class B extends A
{
    public B()
    {
        this("hello");
        System.out.println("this is class B default constructor");
    }
    public B(String s)
    {
        super();// parent class constructor calling;
        System.out.println("this child class parametrized constructor");
    }
    public void child_display()
    {
        super.display(); // calling parent method display
        System.out.println(super.val);

    }

    public static void main(String[] args) {
        B b=new B();
        b.child_display();
    }

}
