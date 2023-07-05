package javagla;

 public class InstanceOf
{
    public void print()
    {
        System.out.println("this is print function");
    }
}
 class Inmain
{
    public static void main(String[] args) {
        InstanceOf is=new InstanceOf();
        is.print();
        InstanceOf is2=null;
        System.out.println(is2 instanceof InstanceOf);//
        System.out.println(is instanceof InstanceOf);
    }

}
