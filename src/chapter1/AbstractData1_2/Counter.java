package chapter1.AbstractData1_2;

public class Counter {
    private final String id;
    private int count;

    public Counter(String id) {
        this.id = id;
    }

    public void increment() {
        this.count += 1;
    }

    public int totally() {
        return this.count;
    }

    public String toString() {
        return "Counter " + this.id + " called " + count;
    }
}
