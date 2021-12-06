package chapter2.ElementarySorts;

public class Ex2_1_24 {
    public static class GuardInsertionSort<T extends Comparable<T>> implements Example<T> {
        @Override
        public void sort(T[] a) {
            int min = 0;
            for (int i = 0; i < a.length; i++) {
                if (less(a[i], a[min])) {
                    min = i;
                }
            }
            exchange(a, 0, min);
            for (int i = 1; i < a.length; i++) {
                for (int j = i; less(a[j], a[j - 1]); j--) {
                    exchange(a, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(SortCompare.timeRandomInput(new GuardInsertionSort<Double>(), 10000, 30));
        System.out.println(SortCompare.timeRandomInput(new ShellSort<Double>(), 10000, 30));
        System.out.println(SortCompare.timeRandomInput(new InsertionSort<Double>(), 10000, 30));
    }
}