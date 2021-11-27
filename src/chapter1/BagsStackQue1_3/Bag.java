package chapter1.BagsStackQue1_3;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public void add(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        N++;
    }

    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current == null;
        }

        @Override
        public Item next() {
            Item res = current.item;
            current = current.next;
            return res;
        }
    }
}
