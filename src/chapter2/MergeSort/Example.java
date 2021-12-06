package chapter2.MergeSort;

public class Example {
    public static boolean less(Comparable a, Comparable a2) {
        return a.compareTo(a2) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            count++;
            if (count == 50) {
                count = 0;
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(less(5, 4));
    }

}
