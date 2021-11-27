package chapter1;

public class Ex1_1_16 {
    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        for (String n : args) {
            String res = exR1(Integer.parseInt(n));
            System.out.println(res);
        } // if n == 6 {res == 311361142246}
    }
}
