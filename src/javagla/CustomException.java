package javagla;

public class CustomException extends Exception
{
    CustomException()
    {
        super("you have an invalid age");
    }
    CustomException(String str)
    {
        super();
    }
}
class Voting
{
    public static void main(String[] args) throws RuntimeException {
        int age=19;
        try {
            if(age<=18)
            {
                throw new CustomException();
            }
            else
            {
                System.out.println("you enter the vaild age");
            }
        }catch (CustomException e)
        {
            System.out.println(e);
        }
    }
}
