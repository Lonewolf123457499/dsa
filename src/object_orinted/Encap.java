package object_orinted;

public class Encap
{
     private int a;
    public void setid(int id)
    {
        a=id;
    }
    public int getind()
    {
        return a;
    }
}
class Emp
{
    public static void main(String[] args) {
        Encap en=new Encap();
        en.setid(20);
        System.out.println(en.getind());
    }
}
