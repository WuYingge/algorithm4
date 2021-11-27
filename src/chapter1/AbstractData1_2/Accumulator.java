package chapter1.AbstractData1_2;

public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    public String toString() {
        return String.format("Mean of %d values is %.5f", this.N, this.mean());
    }
}
