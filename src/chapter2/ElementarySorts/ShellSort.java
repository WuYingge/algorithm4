package chapter2.ElementarySorts;

import StdLib.In;

public class ShellSort<T extends Comparable<T>> implements Example<T> {
    @Override
    public void sort(T[] a) {
        int N = a.length / 3 + 1;
        for (; N > 0; N = N / 3) {
            for (int i = N; i < a.length; i += 1) {
                for (int j = i; j - N >= 0 && less(a[j], a[j - N]); j -= N) {
                    exchange(a, j - N, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        In in = new In("src/chapter2/ElementarySorts/tiny.txt");
        while (!in.isEmpty()) {
            String line = in.readLine();
            String[] inputStrings = line.split("\\s");
            ShellSort<String> shellSort = new ShellSort<>();
            shellSort.show(inputStrings);
            shellSort.sort(inputStrings);
            shellSort.show(inputStrings);

        }
    }

}
