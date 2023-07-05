package javagla;

public class Gener
{
    public static <E> void printarray( E[] elements)
    {
        for( E e:elements)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Integer in[]={1,2,3,4};
        String s[]={"piyush","samarth"," ",""};
        printarray(in);
        printarray(s);
    }
}
