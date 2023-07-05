package object_orinted;

class Rectangle
{
    public int RectangleArea(int l,int b)
    {
        return l*b;
    }
    public int RectanglePerimeter(int l,int b)
    {
        return 2*l+2*b;
    }
}
class Square
{
    public int SquareArea(int side)
    {
        return side*side;
    }
    public int SquarePerimeter(int side)
    {
        return 4*side;
    }
}
public class Area
{
    public static void main(String[] args)
    {
        Rectangle pl=new Rectangle();
        System.out.println(" the area of the Rectangle"+pl.RectangleArea(4,5));
        System.out.println("the perimeter of the rectangle"+pl.RectanglePerimeter(4,5));
        // second object for square area calculation
        Square sq= new Square();
        {
            System.out.println(" the  area of the square"+sq.SquareArea(4));
            System.out.println(" the perimeter of the square"+sq.SquarePerimeter(4));
        }


    }

}
