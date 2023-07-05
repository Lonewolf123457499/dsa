package Bruhhh;

import java.util.ArrayList;

public class Get_subquence
{
    public static ArrayList<String>getss(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String>baseresult=new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }

        char cc=str.charAt(0);
        String rros =str.substring(1);
        ArrayList<String>myresult=new ArrayList<>();
        ArrayList<String>recresult=getss(rros);
        for(int i=0;i<recresult.size();i++)
        {
            myresult.add(recresult.get(i));
            myresult.add(cc+recresult.get(i));
        }
        return myresult;

    }
}
