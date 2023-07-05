package object_orinted;

class  Worker
{
    int salary;
    String name;
    public int Getsalary()
    {
        return salary;
    }
    public  String GetName()
    {
        return name;
    }
    public void Setnames(String n)
    {
        name=n;
    }
}
class Mobile
{
    public void Ringing()
    {
        System.out.println("Ringing.......");
    }
    public void Vibrating()
    {
        System.out.println("Vibrating......");
    }
}
public class Empolyee
{
    public static void main(String[] args)
    {
        Worker wk=new Worker();
        wk.salary=1200;
        wk.name="vedant singh";
        System.out.println(wk.GetName());
        System.out.println(wk.Getsalary());

        //object creatation for second class
        Mobile wkk=new Mobile();
        wkk.Ringing();
        wkk.Vibrating();
    }
}
