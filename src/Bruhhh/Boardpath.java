package Bruhhh;

import java.util.ArrayList;

public class Boardpath
{
    public static ArrayList<String> getboardpath(int curr,int end) {
        if(curr==end) {
            ArrayList<String>base=new ArrayList<>();
            base.add(" ");
        }
        if(curr>end) {
            ArrayList<String>bas=new ArrayList<>();
            bas.add("");
        }
        ArrayList<String> mr = new ArrayList<>();
        for (int dice = 0; dice <= 6; dice++) {
            ArrayList<String> rr = getboardpath(curr + dice, end);
            for (String rrs : rr)
            {
                mr.add(dice + rrs);
            }
        }
        return mr;
    }
    public static  void main(String[] args)
    {
        System.out.println(getboardpath(1,10));

    }
}
