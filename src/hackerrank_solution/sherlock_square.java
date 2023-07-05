package hackerrank_solution;

public class sherlock_square
{
    public static int sherlock(int a,int b)
    {
        int count=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=1;j<=b;j++)
            {
                if(j==Math.sqrt(i))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int O_of_1_complexity (int a,int b)
    {
        return (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);

    }

    public static void main(String[] args) {
        System.out.println(sherlock(17,24));
        System.out.println(O_of_1_complexity(24,49));
    }
}
