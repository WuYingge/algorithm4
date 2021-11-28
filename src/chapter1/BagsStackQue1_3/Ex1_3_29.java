package chapter1.BagsStackQue1_3;

import java.util.Iterator;

public class Ex1_3_29 {
    private static class CircleQueue<Item> implements Iterable<Item> {
        public class Node {
            Item item;
            Node next;
        }

        private Node last = new Node();
        private int N;

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        public void push(Item item) {
            if (isEmpty()) {
                last.item = item;
                last.next = last;
            } else {
                Node first = last.next;
                Node node = new Node();
                node.item = item;
                last.next = node;
                node.next = first;
                last = node;
            }
            N++;
        }

        public Item pop() {
            Item res = last.next.item;
            N--;
            last.next = last.next.next;
            return res;
        }

        public Iterator<Item> iterator() {
            return new QueueIterator();
        }

        private class QueueIterator implements Iterator<Item> {
            private Node current = last.next;
            private boolean flag = false;

            @Override
            public boolean hasNext() {
                return !flag || current != last.next;
            }

            @Override
            public Item next() {
                flag = true;
                Item res = current.item;
                current = current.next;
                return res;
            }
        }
    }

    public static void main(String[] args) {
        CircleQueue<Integer> circleQueue = new CircleQueue<>();
        circleQueue.push(0);
        circleQueue.push(1);
        for (Integer integer : circleQueue) {
            System.out.println(integer);
        }
        System.out.println(circleQueue.pop());
        circleQueue.push(2);
        circleQueue.push(3);
        for (Integer integer : circleQueue) {
            System.out.println(integer);
        }
        System.out.printf("size: %d\n", circleQueue.size());
        for (int i = 0; i < 3; i++) {
            System.out.println(circleQueue.pop());
        }
        System.out.println(circleQueue.size());
    }
}
