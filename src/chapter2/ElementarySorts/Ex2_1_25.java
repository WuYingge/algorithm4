package chapter2.ElementarySorts;

import StdLib.In;

public class Ex2_1_25 {
    public static class InsertionWithOneExch<T extends Comparable<T>> implements Example<T> {
        @Override
        public void sort(T[] a) {
            for (int i = 1; i < a.length; i++) {
                int des = i;
                for (int j = i; j > 0 && less(a[i], a[j - 1]); j--) {
                    des = j - 1;
                }
                T val = a[i];
                for (int k = i; k > des; k--) {
                    a[k] = a[k - 1];
                }
                a[des] = val;
            }
        }
    }

    public static void main(String[] args) {
        In in = new In("src/chapter2/ElementarySorts/tiny.txt");
        while (!in.isEmpty()) {
            String[] line = in.readLine().split("\\s");
            InsertionWithOneExch<String> insertionWithOneExch = new InsertionWithOneExch<>();
            insertionWithOneExch.sort(line);
            assert insertionWithOneExch.isSorted(line);
            insertionWithOneExch.show(line);
        }
        System.out.println(
                SortCompare.timeRandomInput(
                        new InsertionSort<Double>(), 10000, 10));// time = 1.896
        System.out.println(
                SortCompare.timeRandomInput(
                        new InsertionWithOneExch<Double>(), 10000, 10));// time = 1.242
    }
}
