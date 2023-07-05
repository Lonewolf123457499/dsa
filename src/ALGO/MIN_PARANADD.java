package ALGO;

import java.sql.Statement;
import java.util.Stack;

public class MIN_PARANADD
{

    public static int minAddBracket(String str)
    {
        Stack<Character>st=new Stack<>();
        for(char ch:str.toCharArray()) {
            if(ch==')')
            {
                if(!st.isEmpty()&&st.peek()=='(')
                {
                    st.pop();
                }
                else
                    st.push(ch);
            }
            else{
                st.push(ch);
            }
            }
        return  st.size();
    }

    public static void main(String[] args) {
        System.out.println(minAddBracket("(()"));
    }
}
