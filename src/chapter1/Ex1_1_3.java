package chapter1;

import java.lang.System;

public class Ex1_1_3 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.printf("%s", args.length);
            System.out.print("must be 3 ints");
            return;
        }
        // System.out.print(args[0]);
        // System.out.print(args[1]);
        // System.out.print(args[2]);
        // System.out.print(args[0] == args[2]);
        Boolean res = Integer.parseInt(args[0]) == Integer.parseInt(args[2])
                && Integer.parseInt(args[2]) == Integer.parseInt(args[1]);
        System.out.printf("%s", res);
    }
}
