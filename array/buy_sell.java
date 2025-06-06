public class buy_sell {

    public static void main(String args[]) {
        int prices[] = { 12, 5, 3, 7, 2 };
        System.out.println(buyAndsellStockPrice(prices));
    }

    public static int buyAndsellStockPrice(int prices[]) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            // find max profit of the day
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
}