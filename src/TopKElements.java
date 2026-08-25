package src;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int index=0;index<nums.length;index++){
            if(map.containsKey(nums[index])){
                map.put(nums[index],map.get(nums[index])+1);
            }
            else{
                map.put(nums[index],1);
            }
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        int []result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,3};
        int k=2;
        TopKElements obj=new TopKElements();
        System.out.println(Arrays.toString(obj.topKFrequent(arr,k)));
    }
}
