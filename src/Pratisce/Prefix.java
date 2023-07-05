package Pratisce;

import java.util.Stack;

public class Prefix
{
        public static int precedence(char ch) {
            switch (ch) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
            }
            return -1;
        }

        public static String infixToPostfix(String infix) {
            StringBuilder postfix = new StringBuilder();

            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < infix.length(); i++) {
                char ch = infix.charAt(i);

                if (Character.isLetterOrDigit(ch)) {
                    postfix.append(ch);
                } else if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop());
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }

            while (!stack.isEmpty()) {
                postfix.append(stack.pop());
            }

            return postfix.toString();
        }

        public static void main(String[] args) {
            String infix = "(X+Y*Z^P-(x/y)+Z)";
           String postfix = infixToPostfix(infix);
            System.out.println(postfix);
}
    }

