package ALGO;

import java.util.Stack;

public class Stock_span {
    public static void stockspan(int stock[], int span[]) {
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!st.isEmpty() && currPrice > stock[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevhigh = st.peek();
                span[i] = i - prevhigh;
            }
            st.push(i);
        }
    }
    public static void spanOfStock(int stocks[],int span[])
    {
        Stack<Integer>st=new Stack<>();
        stocks[0]=1;
        st.push(1);
        for(int i=1;i<stocks.length;i++)
        {
            int currPrice=stocks[i];
            while(!st.isEmpty()&&currPrice>stocks[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                span[i]=i+1;
            }
            else
            {
                int prevHigh=st.peek();
                span[i]=i-prevHigh;

            }
            st.push(i);

        }
    }


    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockspan(stocks,span);
        for (int i=0;i<span.length;i++)
        {
            System.out.println(span[i]);
        }
    }
}
