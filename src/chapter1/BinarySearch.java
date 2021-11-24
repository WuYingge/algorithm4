package chapter1;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        int index = -1;
        int start = 0;
        int end = a.length - 1;
        int mid;
        while (start < end - 1) {
            mid = (end + start) / 2;
            if (a[mid] < key) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (a[start] == key) {
            index = start;
        } else if (a[end] == key) {
            index = end;
        }
        return index;
    }

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        int key = Integer.parseInt(args[1]);
        int res = rank(key, array);
        System.out.println(res);
    }
}
