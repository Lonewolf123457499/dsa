package hackerrank_solution;
import java.util.*;
public class gradingstudent
{
    public static List<Integer> gradingStudents(List<Integer> grades)
    {
        ArrayList<Integer>result=new ArrayList<>();
        double remain=0;
        int reans=0;
        for(int i=0;i<grades.size();i++)
        {
            if(grades.get(i)<38)
            {
                reans=grades.get(i);
                result.add(reans);
            }
            else
            {
                remain=(Math.ceil(grades.get(i)/5)+1);
                int t=(int)remain;
                int ans=Math.abs(t*5-grades.get(i));
                if(ans<3)
                {
                    reans=grades.get(i)+ans;
                    result.add(reans);
                }
                else
                {
                    reans=grades.get(i);
                    result.add(reans);

                }
            }
        }
        return result;

    }

    public static void main(String[] args)
    {
        ArrayList<Integer>result=new ArrayList<>();
        result.add(73);
        result.add(67);
        result.add(38);
        result.add(33);
        System.out.println(gradingStudents(result));

    }
}