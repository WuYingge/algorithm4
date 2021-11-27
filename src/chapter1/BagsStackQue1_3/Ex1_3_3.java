package chapter1.BagsStackQue1_3;

import StdLib.In;

public class Ex1_3_3 {

    public static boolean checkStack(Integer[] arr) {
        Stack<Integer> stack = new Stack<>();
        int out = 0;
        int num = 0;
        while (out < arr.length && num < 11) {
            Integer nowPrint = arr[out];
            if (stack.isEmpty()) {
                stack.push(num++);
            } else {
                Integer popped = stack.pop();
                if (nowPrint != popped) {
                    stack.push(popped);
                    stack.push(num);
                    num++;
                } else {
                    out++;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        try {
            In in = new In("src/chapter1/BagsStackQue1_3/Ex1_3_3.txt");
            while (!in.isEmpty()) {
                String s = in.readLine();
                String[] splited = s.split("\\s");
                Integer[] arr = new Integer[10];
                for (int i = 0; i < splited.length; i++) {
                    arr[i] = Integer.parseInt(splited[i]);
                }
                System.out.println(checkStack(arr));
            }
        } catch (Exception e) {
            System.out.print(e.getStackTrace());
        }

    }

}
