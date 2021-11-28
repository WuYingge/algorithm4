package chapter1.BagsStackQue1_3;

import java.util.HashMap;
import java.util.Map;
import StdLib.In;

public class Ex1_3_4 {
    public static boolean checkParentheses(String[] parentheses) {
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < parentheses.length; i++) {
            if (map.containsKey(parentheses[i])) {
                if (stack.isEmpty()) {
                    return false;
                }
                String check = stack.pop();
                if (!check.equals(map.get(parentheses[i]))) {
                    return false;
                }
            } else {
                stack.push(parentheses[i]);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        In in = new In("src/chapter1/BagsStackQue1_3/Ex1_3_4.txt");
        while (!in.isEmpty()) {
            String line = in.readLine();
            System.out.println(checkParentheses(line.split("")));
        }
    }
}
