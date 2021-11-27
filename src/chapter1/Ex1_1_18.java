package chapter1;

public class Ex1_1_18 {
    /*
     * 原来这个是乘法
     */
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        } else {
            return mystery(a + a, b / 2) + a;
        }
    }

    /*
     * 那么这个就是次方咯
     */
    public static int mystery2(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            return mystery2(a * a, b / 2);
        } else {
            return mystery2(a * a, b / 2) * a;
        }
    }

    public static void main(String[] args) {
        int a = (int) Integer.parseInt(args[0]);
        int b = (int) Integer.parseInt(args[1]);
        System.out.printf("origin: %d\n", mystery(a, b));
        System.out.printf("changed: %d\n", mystery2(a, b));
    }
}
