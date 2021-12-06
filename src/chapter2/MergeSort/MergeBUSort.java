package chapter2.MergeSort;

import StdLib.In;

public class MergeBUSort extends Example {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        int n = 1;
        for (; n < a.length; n *= 2) {
            for (int lo = 0; lo < a.length; lo += 2 * n) {
                int mid = lo + n - 1;
                int hi = mid + n < a.length ? mid + n : a.length - 1;
                merge(a, lo, mid, hi);
            }
        }
        // for (int lo = 0; lo < a.length; lo += n) {
        // int hi = lo + n - 1 < a.length ? lo + n - 1 : a.length - 1;
        // int mid = (n + lo) / 2;
        // merge(a, lo, mid, hi);
        // }

    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = i; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    public static void main(String[] args) {
        In in = new In("src/chapter2/ElementarySorts/tiny.txt");
        while (!in.isEmpty()) {
            String[] line = in.readLine().split(" ");
            MergeBUSort.sort(line);
            // System.out.println(MergeBUSort.isSorted(line));
            MergeBUSort.show(line);
        }
    }

}
