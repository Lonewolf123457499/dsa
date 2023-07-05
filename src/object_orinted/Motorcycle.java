package object_orinted;

abstract class Motorcycle
{
     abstract void start();
}
// to implement abstraction method overriding should be done
// inheritance also involve in abstraction.
class xtreme extends Motorcycle
{
    void start()
    {
        System.out.println(" it is kick start bike");
    }
}
class Cbshine extends Motorcycle
{
    @Override
    void start()
    {
        System.out.println("it is self start bike");
    }

    public static void main(String[] args)
    {
        Cbshine cb = new Cbshine();
        cb.start();
        xtreme x=new xtreme();
        x.start();
    }
}
