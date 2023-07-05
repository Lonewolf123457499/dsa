import java.util.ArrayList;

public class csc
{
    static String key[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String digits="35";
        ArrayList<String> li = new ArrayList<>();
        solve(digits,li,"");
        for(int i=0;i<li.size();i++) {
            System.out.println(li.get(i));
        }
    }
    public static void solve(String digits,ArrayList<String> li,String ans){
        if(digits.length()==0){
            li.add(ans);
            return;
        }
        String ch = key[digits.charAt(0)-48];
        for(int i=0;i<ch.length();i++){
            solve(digits.substring(1),li,ans+ch.charAt(i));
 }
    }


}

