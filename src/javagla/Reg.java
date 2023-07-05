package javagla;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg
{
    public static void main(String[] args) {
        Pattern p=Pattern.compile("^a|^b|^c|^d|^e|^f|^g|^h|^i|^j|^l|m|^n",Pattern.CASE_INSENSITIVE);


        Matcher m = p.matcher("aeetarge5tNeeStringetanee");
        int ctr=0;
        while(m.find())
        {
            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
            ctr++;
        }
        System.out.println(ctr);
    }
}


