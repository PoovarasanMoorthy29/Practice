public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        for(int index=0;index<nums.length;index++){
            if(nums[index]==val){
                nums[index]=-1;
            }
        }
        int index=0;
        int count=0;
        for(int num=0;num<nums.length;num++){
            if(nums[num]!=-1){
                nums[index++]=nums[num];
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        RemoveElement obj=new RemoveElement();
        int[] num={3,2,2,3};
        int val=3;
        System.out.println(obj.removeElement(num,val));
    }
}
