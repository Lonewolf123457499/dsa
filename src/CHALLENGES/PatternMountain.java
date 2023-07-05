package CHALLENGES;

public class PatternMountain
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==(i+j)-1||i==j)
                {
                    System.out.print(i);
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
