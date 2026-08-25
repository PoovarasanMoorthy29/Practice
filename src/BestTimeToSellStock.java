public class BestTimeToSellStock {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] > prices[right]) {
                left++;
                right = left + 1;
            } else {
                int curMax = prices[right] - prices[left];
                if (maxProfit < curMax) {
                    maxProfit = curMax;
                }
                right++;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToSellStock obj =new BestTimeToSellStock();
        int[] arr={7,1,5,3,6,4};
        System.out.println(obj.maxProfit(arr));
    }
}
