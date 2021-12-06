package chapter2.ElementarySorts;

import StdLib.In;

public class InsertionSort<T extends Comparable<T>> implements Example<T> {
    @Override
    public void sort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j - 1, j);
            }
        }
    }

    public static void main(String[] args) {
        InsertionSort<String> insertionSort = new InsertionSort<>();
        In in = new In("src/chapter2/ElementarySorts/tiny.txt");
        while (!in.isEmpty()) {
            System.out.println("sdf");
            String line = in.readLine();
            String[] input = line.split("\\s");
            insertionSort.show(input);
            insertionSort.sort(input);
            insertionSort.show(input);
        }
    }

}
