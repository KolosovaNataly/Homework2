
    public class Main {
        public static void main(String[] args) {
            long [] sales = {1, 2 ,3 };
            SalesManager salesManager = new SalesManager (sales);
            System.out.println(salesManager.max());
            System.out.println(salesManager.trimmedMean());
        }
    }

