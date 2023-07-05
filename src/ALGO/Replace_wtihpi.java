package ALGO;

public class Replace_wtihpi
{
    public static String Replace(String str,int index)
    {
        if(str.length()<=1)
        {
            return str;
        }
      String res=  Replace(str,index+1);
        if(res=="pi")
        {
            res=res.substring(0,index)+"3.14"+res.substring(index+2);
            return res;
        }
        else
        {
            return res;

        }
    }

    public static void main(String[] args) {
        System.out.println(Replace("xpixxxpixxpi",0));

    }
}
