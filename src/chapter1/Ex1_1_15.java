package chapter1;

public class Ex1_1_15 {
    public static int[] histogram(int[] a, int m) {
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    counter++;
                }
            }
            res[i] = counter;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            input[i] = (int) Integer.parseInt(args[i]);
        }
        int[] toPrint = histogram(input, args.length);
        for (int i : toPrint) {
            System.out.println(i);
        }
    }
}
