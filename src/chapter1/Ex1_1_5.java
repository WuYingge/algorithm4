package chapter1;

public class Ex1_1_5 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        boolean res = false;
        if (x < 1 && x > 0 && y < 1 && y > 0) {
            res = true;
        }
        System.out.print(res);
    }
}
