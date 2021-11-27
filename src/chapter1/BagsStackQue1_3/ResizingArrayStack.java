package chapter1.BagsStackQue1_3;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
    public Item[] a;
    public int N = 0;

    public ResizingArrayStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[++N] = item;
    }

    public Item pop() {
        Item res = a[N--];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return res;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {
        }
    }
}
