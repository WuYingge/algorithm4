package chapter1.BagsStackQue1_3;

import StdLib.In;

/*
 *测试
 *input: 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) ) output:  ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 *input: 1 - 3 ) output: ( 1 - 3 )
 *input: 1 + 2 ) * 2 ) / 4 ) + 3 * 2 ) * 2 ) ) output: ( ( ( ( 1 + 2 ) * 2 ) / 4 ) + ( ( 3 * 2 ) * 2 ) )
 */

public class Ex1_3_9 {
    public static String completeLeftParentheses(String[] inputString) {
        Stack<String> vStack = new Stack<>();
        Stack<String> opsStack = new Stack<>();
        for (String s : inputString) {
            if (isOperator(s)) {
                opsStack.push(s);
            } else if (s.equals(")")) {
                String v = vStack.pop();
                String op = opsStack.pop();
                vStack.push(String.format("( %s %s %s )", vStack.pop(), op, v));
            } else {
                vStack.push(s);
            }
        }
        return vStack.pop();
    }

    private static boolean isOperator(String string) {
        return string.equals("-") || string.equals("+") || string.equals("*") || string.equals("/");
    }

    public static void main(String[] args) {
        In in = new In("src/chapter1/BagsStackQue1_3/Ex1_3_9.txt");
        while (!in.isEmpty()) {
            String line = in.readLine();
            System.out.println(completeLeftParentheses(line.split(" ")));
        }
    }
}
