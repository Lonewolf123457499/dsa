package javagla;


   import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Jdbc3
{
        public static void main(String[] args) {
            // Set up the regular expression pattern
            String pattern = "[a-m][0268][a-zA-Z0-9$]{2,}";
            Pattern regex = Pattern.compile(pattern);
            // Check each of the input strings
            String arg="as2d456dfwwfwfwfADDWD";
            for (String ar : args) {
                Matcher matcher = regex.matcher(ar);
                if (matcher.matches()) {
                    System.out.println(arg + " is a valid identifier");
                } else {
                    System.out.println(arg + " is not a valid identifier");
                }
            }
        }
    }

