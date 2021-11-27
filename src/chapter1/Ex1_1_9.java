package chapter1;

public class Ex1_1_9 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(trans((int) Integer.parseInt(args[i])));
        }
    }

    private static String trans(int n) {
        StringBuffer s = new StringBuffer();
        Integer res;
        while (n > 0) {
            res = n % 2;
            s.insert(0, res);
            n = n / 2;
        }
        return s.toString();
    }
}
