import java.util.*;
public class SortEvenAndOddIndices {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length<3)
            return nums;
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if (i%2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);

        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if (i%2 == 0)
                ans[i]=even.get(j++);
            else
                ans[i]=odd.get(k++);
        }
        return ans;
    }

    static void main() {
        SortEvenAndOddIndices obj=new SortEvenAndOddIndices();
        int[] arr={4,1,2,3};
        System.out.println(Arrays.toString(obj.sortEvenOdd(arr)));
    }
}
