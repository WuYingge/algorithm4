package chapter1.BagsStackQue1_3;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        N++;
    }

    public Item pop() {
        Item res = first.item;
        N--;
        first = first.next;
        return res;
    }

    public Iterator<Item> iterator() {
        return new linkedNodeIterator();
    }

    private class linkedNodeIterator implements Iterator<Item> {
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
