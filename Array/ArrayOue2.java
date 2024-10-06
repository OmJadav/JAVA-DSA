public class ArrayOue2 {
    public static void main(String args[]) {
        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(max_profit(prices));
    }

    public static int max_profit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buy) {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

}
