package javagla;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
    public static void main(String[] args) {
        String s[]={"a2h","m4f"};
        String pattern = "[a-m][0268][a-z]|[A-Z]|[0-9]|[$]{3}";
        Pattern regex = Pattern.compile(pattern);
        for (String arg : s) {
            Matcher matcher = regex.matcher(arg);
            if (matcher.matches()) {
                System.out.println(arg + " is a valid identifier");
            } else {
                System.out.println(arg + " is not a valid identifier");
            }

    }
}
}








