package Bruhhh;

import java.util.ArrayList;

public class getsequence
{
    public static ArrayList<String> getsubsequence(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String>baseresult=new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>myresult=new ArrayList<>();
        ArrayList<String>result=getsubsequence(ros);
        for(int i=0;i<result.size();i++)
        {
            myresult.add(result.get(i));
            myresult.add(cc+result.get(i));
        }
        return myresult;
    }

    public static void main(String[] args) {
        System.out.println(getsubsequence("123"));
    }
}
