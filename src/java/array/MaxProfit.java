package array;

public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,4,1}));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }

        return max;
    }
}
