package javagla;
// can interface object can be created
//  can be created reference of interface
interface Shape
{
     void sum();
    void sub();
}
public class Interface_intro implements Shape {

    @Override
    public void sum() {
        System.out.println("it gave the sum");
    }

    @Override
    public void sub() {
        System.out.println("it gave the subtraction");
    }
    public void product()
    {
        System.out.println("it gave the product of two number");
    }

    public static void main(String[] args)
    {
        Interface_intro in=new Interface_intro();
        in.sum();
        in.sub();
        in.product();
    }
}
