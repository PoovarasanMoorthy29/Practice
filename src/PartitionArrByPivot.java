package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PartitionArrByPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        List<Integer> pivots=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                left.add(nums[i]);
            }
            else if (nums[i]==pivot){
                pivots.add(nums[i]);
            }
            else{
                right.add(nums[i]);
            }
        }

        for(int i=0;i<left.size();i++){
            nums[i]=left.get(i);
        }
        int k=left.size();
        for(int i=0;i<pivots.size();i++){
            nums[k++]=pivots.get(i);
        }
        for(int i=0;i<right.size();i++){
            nums[k++]=right.get(i);
        }

        return nums;

    }

    public static void main(String[] args) {
        int [] arr={9,12,5,10,14,3,10};
        int pivot=10;
        PartitionArrByPivot obj=new PartitionArrByPivot();
        System.out.println(Arrays.toString(obj.pivotArray(arr,pivot)));
    }
}
