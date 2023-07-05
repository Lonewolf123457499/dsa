package object_orinted;

class Demo
{
   private int id;
    private String names;
    public String GetName()
    {
        return names;
    }
    public void SetName(String n)
    {
        this.names=n;
    }
    public int GetId()
    {
        return id;
    }
    public void SetId(int i)
    {
        this.id=i;
    }
}
public class Getter_Setter_Demo
{
    public static void main(String[] args)
    {
        Demo in=new Demo();
        in.SetName("vednt singh");
        System.out.println(in.GetName());
        in.SetId(44);
        System.out.println(in.GetId());
        in.SetName("vicky");
        System.out.println(in.GetName());
        in.SetId(56);
        System.out.println(in.GetId());

    }
}
