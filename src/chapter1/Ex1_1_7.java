package chapter1;

public class Ex1_1_7 {
    public static void main(String[] args) {
        printf("a: %.5f\n", a());
        printf("b: %d\n", b());
        printf("c: %d\n", c());
    }

    private static void printf(String format, int content) {
        System.out.printf(format, content);
    }

    private static void printf(String format, Double content) {
        System.out.printf(format, content);
    }

    public static Double a() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        return t;
    }

    public static int b() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static int c() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        return sum;
    }
}
