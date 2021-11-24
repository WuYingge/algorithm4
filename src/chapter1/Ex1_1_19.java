package chapter1;

public class Ex1_1_19 {
    public static long origin(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return origin(n - 1) + origin(n - 2);
        }
    }

    public static long advanced(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                a[i] = 1;
            } else {
                a[i] = a[i - 2] + a[i - 1];
                // System.out.println(b);
            }
        }
        return a[n - 1];
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.printf("%d: %d\n", i, advanced(i));
        }
    }
}
