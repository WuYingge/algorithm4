package chapter1.AbstractData1_2;

public class Accumulator {
    private double total;
    private int N;
    private double s, m;

    public void addDataValue(double val) {
        N++;
        total += val;
        s = s + 1.0 * (N - 1) / N * (val - m) * (val - m);
        m = m + (val - m) / N;
    }

    public double mean() {
        return m;
    }

    public double var() {
        return s / (N - 1);
    }

    public double stddev() {
        return Math.sqrt(this.var());
    }

    public double getTotal() {
        return total;
    }

    public String toString() {
        return String.format("Mean of %d values is %.5f", this.N, this.mean());
    }
}
