package chapter2.ElementarySorts;

import StdLib.StdRandom;
import StdLib.Stopwatch;

public class SortCompare {
    public static <T extends Comparable<T>> double time(Example<T> sorter, T[] a) {
        Stopwatch timer = new Stopwatch();
        sorter.sort(a);
        return timer.elapsedTime();

    }

    public static double timeRandomInput(Example<Double> sorter, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(sorter, a);
        }
        return total;
    }

    public static <T extends Comparable<T>> double timeCertainInput(Example<Integer> sorter, Integer[] a, int T) {
        double total = 0.0;
        Integer aCopy[] = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            aCopy[i] = a[i];
        }
        for (int t = 0; t < T; t++) {
            total += time(sorter, aCopy);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(SortCompare.timeRandomInput(new InsertionSort<Double>(), 20000, 10));
        System.out.println(SortCompare.timeRandomInput(new SelectionSort<Double>(), 20000, 10));
        Integer[] b = { 1, 3, 42, 3, 213, 5656, 12 };
        System.out.println(SortCompare.timeCertainInput(new InsertionSort<Integer>(), b, 100000000));
        System.out.println(SortCompare.timeCertainInput(new SelectionSort<Integer>(), b, 100000000));
    }
}
