package leetocodeAndgfg;


import java.util.Stack;

public class Vaildpratheneis
{
    public static boolean isvalid(String str)
    {
        Stack<Character > st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch=='['||ch=='{'||ch=='(')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return true;
                } else if (st.peek()=='['&&ch==']'||st.peek()=='{'&&ch=='}'||st.peek()=='('&&ch==')')
                {
                    st.pop();
                }
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static  int   linearSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+linearSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(isvalid("[]"));
        System.out.println(linearSum(5));
    }
}
