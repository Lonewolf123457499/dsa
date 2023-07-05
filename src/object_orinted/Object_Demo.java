package object_orinted;
class  Animal
{
    int id;
    String name;
    public void Getdetail()
    {
        System.out.println("my id is"+id);
        System.out.println("my names "+name);
    }
}

public class Object_Demo
{
    public static void main(String[] args) {
        Animal al=new Animal();
        al.id=12;
        al.name="dog";
        // creating new object
        Animal ml=new Animal();
        ml.id=23;
        ml.name="vedant";
        ml.Getdetail();

        al.Getdetail();
    }
}
