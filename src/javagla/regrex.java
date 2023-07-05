package javagla;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regrex
{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-D]|[a-z]|[0-9] |[$]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("neetargetNeeString$");
        int ctr = 0;
        while (m.find()) {
            System.out.println(m.start() + "   " + m.end() + "   " + m.group());
            ctr++;
        }
        System.out.println(ctr);
    }
}
