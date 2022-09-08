import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long trimmedMean() {
        long[] copy = sales.clone();
        long sum = 0;
        Arrays.sort(copy);
        for (int i = 1; i < copy.length - 1; i++) {
            sum = sum + copy[i];
        }
        return sum / (copy.length - 2);
    }
}
