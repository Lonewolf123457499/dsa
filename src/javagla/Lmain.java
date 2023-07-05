package javagla;
interface Area
{
    public int  length();
    public int breadth();
    public int area();

}
class Rectangle implements Area
{

    @Override
    public int length()
    {
        int l=10;
        return l;

    }

    @Override
    public int  breadth()
    {
        int b=20;
        return b;

    }

    @Override
    public int area()
    {
        int area=breadth()*length();
        return area;

    }
}
class Square implements Area
{

    @Override
    public int length()
    {
        int l=20;
        return l;
    }

    @Override
    public int breadth() {
        return 0;
    }

    @Override
    public int area()
    {
        int sa=length()*length();
        return sa;
    }
}
public class Lmain
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        System.out.println(r.area());
        Square sq=new Square();
        int l=sq.length()* sq.length();
        System.out.println(l);

    }
}
