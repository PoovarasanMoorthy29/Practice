import java.util.ArrayList;
import java.util.List;

public class BestTimeSellStockII {
    public int maxProfit(int[] prices) {
        /*
        // Brute force
        List<ArrayList<Integer>> profitList=new ArrayList<>();
        for(int i=0;i<prices.length-1;i++){
            ArrayList<Integer> currentProfit=new ArrayList<>();
            for(int j=i+1;j<=i+1;j++){
                currentProfit.add(prices[j]-prices[i]);
            }
            profitList.add(currentProfit);
        }
        int profit=0;
        for(int i=0;i<profitList.size();i++){
            if(profitList.get(i).get(0)>0){
                profit+=profitList.get(i).get(0);
            }
        }
        return (profit>0)?profit:0;
        */


        /*
        // Better force
        List<Integer> profitList=new ArrayList<>();
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<=i+1;j++){
                profitList.add(prices[j]-prices[i]);
            }

        }
        int profit=0;
        for(int i=0;i<profitList.size();i++){
            if(profitList.get(i)>0){
                profit+=profitList.get(i);
            }
        }
        return profit;
        */

        /*
        // optimal solution & Time Complexity :0(N) & space complexity :O(1)
        int profit=0;
        for(int index=0;index<prices.length-1;index++){
            if(prices[index+1]-prices[index] >0){
                profit+=prices[index+1]-prices[index];
            }
        }
        return profit; */
        //  optimized to the core
        int profit=0;
        for(int index=0;index<prices.length-1;index++){
            int currentProfit=prices[index+1]-prices[index];
            if( currentProfit>0){
                profit+=currentProfit;
            }
        }
        return profit;

    }
    public static void main(String [] args){
        int [] arr={7,1,5,3,6,4};
        BestTimeSellStockII obj=new BestTimeSellStockII();
        System.out.println(obj.maxProfit(arr));
    }
}
