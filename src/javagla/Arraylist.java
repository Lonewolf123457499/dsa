package javagla;
import java.util.ArrayList;
public class Arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> mr=new ArrayList<>();
        mr.add(10);
        mr.add(20);
        mr.add(30);
        mr.add(12);
        mr.add(12);
        mr.remove(new Integer(12));
        mr.clear();// remove all the element of the arraList;
        for(int i=0;i< mr.size();i++)
        {
            System.out.println(mr.get(i));
        }
    }
}
