package chapter1;

public class Ex1_1_27 {
    public static long count = 0;

    public static double bionominal(int N, int k, double p) {
        count += 1;
        if (N == 0 && k == 0) {
            return 1.0;
        } else if (N < 0 || k < 0) {
            return 0.0;
        }
        return p * bionominal(N - 1, k - 1, p) + (1.0 - p) * bionominal(N - 1, k, p);
    }

    public static double newBionominal(int N, int k, double p) {
        double[][] v = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                v[i][j] = -1;
            }
        }
        return caclNewbionominal(N, k, p, v);
    }

    public static double caclNewbionominal(int N, int k, double p, double[][] v) {
        count += 1;
        if (N == 0 && k == 0) {
            v[N][k] = 1.0;
            return 1.0;
        } else if (N < 0 || k < 0) {
            return 0.0;
        }
        if (v[N][k] != -1) {
            return v[N][k];
        }
        v[N][k] = p * caclNewbionominal(N - 1, k, p, v) + (1.0 - p) * caclNewbionominal(N - 1, k - 1, p, v);
        return v[N][k];
    }

    public static void main(String[] args) {
        int N = 30;
        int k = 15;
        double p = 0.5;
        double res = bionominal(N, k, p);
        System.out.println(count);
        System.out.println(res);
        count = 0;
        res = newBionominal(N, k, p);
        System.out.println(count);
        System.out.println(res);
    }
    /*
     * Origin: N = 10 k=5 2467 counts; N = 20 k=10 2433071 counts; N = 30 k=15
     * 2438328997 counts. Advanced: N = 10 k=5 101 counts; N = 20 k=10 351 counts; N
     * = 30 k=15 751 counts.
     */
}
