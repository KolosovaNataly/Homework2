
    public class Main {
        public static void main(String[] args) {
            int [] sale = {1, 2 ,3 };
            SalesManager salesManager = new SalesManager(sale);
            System.out.println(salesManager.max());
            System.out.println(salesManager.trimmedMean());
        }
    }

