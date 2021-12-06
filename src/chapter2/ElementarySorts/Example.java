package chapter2.ElementarySorts;

public interface Example<T extends Comparable<T>> {
    default boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    default void exchange(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    default boolean isSorted(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (!less(a[i], a[i + 1])) {
                return false;
            }
        }
        return true;
    }

    default void show(T[] a) {
        int returnLine = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%s", a[i]);
            returnLine++;
            if (returnLine % 19 == 0) {
                returnLine = 0;
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }

    public void sort(T[] a);
}
