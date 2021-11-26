package chapter1.AbstractData1_2;

// import java.util.Arrays;

public class StaticSETofInts {
    private int[] a;

    public StaticSETofInts(int[] keys) {
        a = new int[keys.length];
        for (int i = 0; i < keys.length; i++) {
            a[i] = keys[i];
        }
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {
        int start = 0;
        int end = this.a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (this.a[mid] < key) {
                start = mid + 1;
            } else if (this.a[mid] > key) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}