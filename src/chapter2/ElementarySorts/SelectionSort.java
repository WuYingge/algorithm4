package chapter2.ElementarySorts;

import StdLib.In;

public class SelectionSort<T extends Comparable<T>> implements Example<T> {
    @Override
    public void sort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exchange(a, i, min);
        }
    }

    public static void main(String[] args) {
        SelectionSort<String> selectionSort = new SelectionSort<>();
        In in = new In("src/chapter2/ElementarySorts/tiny.txt");
        while (!in.isEmpty()) {
            String line = in.readLine();
            String[] input = line.split("\\s");
            selectionSort.show(input);
            selectionSort.sort(input);
            selectionSort.show(input);
        }
    }

}
