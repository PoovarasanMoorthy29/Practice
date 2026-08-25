package src;
import java.util.Arrays;
public class MinimumBuyingCandies {
    public int minimumCost(int[] cost) {
        if (cost.length < 2) {
            return cost[0];
        }
        if (cost.length == 2) {
            return cost[0] + cost[1];
        }
        Arrays.sort(cost);
        int result = 0;
        int count = 0;
        for (int index = 0; index < cost.length; index++) {
            result += cost[index];
        }
        for (int i = cost.length - 1; i >= 0; i--) {
            if (count == 2) {
                result -= cost[i];
                count = 0;
            } else {
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[]arr={2,5,2,7,6,9};
        MinimumBuyingCandies obj=new MinimumBuyingCandies();
        System.out.println(obj.minimumCost(arr));
    }
}
