public class FindUniqueEvenElement {
    public int firstUniqueEven(int[] nums) {
        int max=nums[0];
        for(int num:nums){
            max=Math.max(num,max);
        }
        int [] freq=new int[max+1];
        for(int index=0;index<nums.length;index++){
            freq[nums[index]]++;

        }
        for(int index=0;index<nums.length;index++){
            if(freq[nums[index]]==1 && nums[index]%2==0){
                return nums[index];
            }
        }
        return -1;
    }

    static void main() {
        int []arr={3,4,2,5,4,6};
        FindUniqueEvenElement obj=new FindUniqueEvenElement();
        System.out.println(obj.firstUniqueEven(arr));
    }
}
