package CHALLENGES;

public class Pattern2
{
    public static void main(String[] args) {
        int space;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(space=9;space>=i;)
            {
                System.out.print("-");
                space=space-2;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
