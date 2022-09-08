import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int trimmedMean() {
        int[] copy = sales.clone();
        int sum = 0;
        Arrays.sort(copy);
        for (int i = 1; i < copy.length - 1; i++) {
            sum = sum + copy[i];
        }
        return sum / (copy.length - 2);
    }
}
