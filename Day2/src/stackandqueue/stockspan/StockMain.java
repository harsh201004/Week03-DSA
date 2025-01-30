package stackandqueue.stockspan;

public class StockMain {
    public static void main(String[] args) {
        int[] prices = {100, 120, 60, 170, 60, 75, 85};
        int n = prices.length;

        System.out.println("Stock Span for each day:");

        // Create an instance of the Stock class
        Stock stock = new Stock();

        // Call the non-static method using the instance
        stock.calculateSpan(prices, n);
    }
}
