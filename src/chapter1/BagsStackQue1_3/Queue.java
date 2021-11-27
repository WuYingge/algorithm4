package chapter1.BagsStackQue1_3;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private int N = 0;

    private class Node {
        Item item;
        Node next;
    }

    private Node last;
    private Node first;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        if (!isEmpty()) {
            last.next = newNode;
        } else {
            first = last;
        }
        last = newNode;
        N++;
    }

    public Item dequeue() {
        Item res = first.item;
        first = first.next;
        N--;
        if (isEmpty()) {
            last = null;
        }
        return res;
    }

    public Iterator<Item> iterator() {
        return new queueIterator();
    }

    private class queueIterator implements Iterator<Item> {

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
