package object_orinted;
// understanding the concept of super keyword
public class Super_Keyword
{
    int a=10;
    void m1()
    {
        System.out.println("this is a parent class method");
    }
} 
class Child extends Super_Keyword
{
    int a=20;
    void m1()
    {
        System.out.println("this a  child class method");
    }
     void show(int a)
    {
//        System.out.println(a); 1. use of super keyword to acesss the parent instance varaiable
//        System.out.println(this.a);
//        System.out.println(super.a);
        m1();
        this.m1();
        super.m1(); // we can call parent method by using super keyword
    }

    public static void main(String[] args) {
         Child sc=new Child();
        sc.show(30);
    }
    
}
