package object_orinted;

 public class Finalkeyword
{
    final void run()
    {
        System.out.println(" it is dry ");
    }
    void display()
    {
        System.out.println("display the error");
    }
}
class fin extends Finalkeyword
{
    void display()
    {
        System.out.println("display the e");
    }
//    void run()     final override can not be override.
//    {
//        System.out.println(" it is a dry jjjj");
//    }

    public static void main(String[] args) {
        fin obj=new fin();
        obj.run();
        obj.display();
        Finalkeyword fk=new Finalkeyword();
        obj.display();
        obj.run();
    }
}

