package ALGO;

public class Generictest
{
    public static  <E> void  printArray(E [] elements)
    {
        for ( E element : elements){
            System.out.println(element );
        }
    }
    public static <E> void  printArray2(E [] elements)
    {
        for ( E element : elements){
            System.out.println(element );
        }
    }

}
class pop
{
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        Double [] doublesArray={20.0,50.5,60.5};
        String[] stringArray = {"vedant ", "singh "};
        Generictest.printArray(intArray);

    }
}
