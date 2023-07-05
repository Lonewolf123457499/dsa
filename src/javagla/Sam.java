package javagla;

import java.util.Stack;

public class Sam
{
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        // Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == "*") {
                int s = stack.get(index - 1) * stack.get(index - 2);
                stack.pop();
                stack.pop();
                stack.push(s);
                index--;
            } else if (tokens[i] == "/") {
                int s = stack.get(index - 2) / stack.get(index - 1);
                stack.pop();
                stack.pop();
                stack.push(s);
                index--;
            } else if (tokens[i] == "+") {
                int s = stack.get(index - 1) + stack.get(index - 2);
                stack.pop();
                stack.pop();
                stack.push(s);
                index--;
            } else if (tokens[i] == "-") {
                int s = stack.get(index - 2) - stack.get(index - 1);
                stack.pop();
                stack.pop();
                stack.push(s);
                index--;
            } else {
                stack.push(Integer.parseInt(tokens[i]));
                index++;
            }
        }
        int ans = stack.get(0);
        return ans;
    }

    public static void main(String[] args) {
        String str[]={ "2","1","+","3","*"};
        System.out.println(  evalRPN(str));
    }


    }
