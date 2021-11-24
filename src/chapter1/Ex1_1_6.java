package chapter1;

public class Ex1_1_6 {
    public static void main(String[] args) {
        int g = 1;
        int f = 0;
        for (int i = 0; i <= 15; i++) {
            f = g + f;
            System.out.printf("f: %s\n", f);
            g = f - g;
            System.out.printf("g: %s\n", g);
            // System.out.printf("g: %s, f: %s\n", g, f);
        }
    }
}
