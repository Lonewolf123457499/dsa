package Pratisce;

import java.util.Stack;

public class Postfix_to_infix
{
    public  static int  pre (char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;
            case'*':
            case '/':
                return 2;
            case'^':
                return 3;
        }
        return -1;
    }
    public static String  infix_to_prefix(String infix)
    {
        StringBuilder postfix=new StringBuilder("");
      //  char ch=infix.charAt(0);
        Stack<Character>st=new Stack<>();
        for ( int i=0;i<infix.length();i++)
        {
            char ch=infix.charAt(i);
            if (Character.isLetterOrDigit(ch))
            {
                postfix.append(ch);
            }
            else if (ch=='(')
            {
                st.push(ch);
            }
            else if (ch==')')
            {
                while(!st.isEmpty()&&st.peek()!='(')
                {
                    postfix.append(st.pop());
                }
                st.pop();
            }
            else
            {
                while(!st.isEmpty()&&pre(ch)<=pre(st.peek()))
                {
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty())
        {
            postfix.append(st.pop());
        }
        return  postfix.toString();
    }

    public static void main(String[] args) {
        String str="A*(B+C)/D";
        System.out.println(infix_to_prefix(str));
    }
}
