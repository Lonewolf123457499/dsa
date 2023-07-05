package CHALLENGES;

public class Queenpermuation
{
    public static void queenpermatuation(boolean[] boxes, int qpsf,int tq,String ans)
    {
        if(qpsf==tq)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<boxes.length;i++)
        {
            if(boxes[i]==false)
            {
                boxes[i] = true;
                queenpermatuation(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i+" ");
                boxes[i] = false;
            }
        }
    }




    public static void main(String[] args)
    {
        queenpermatuation(new boolean [4],0,2,"");

    }
}
