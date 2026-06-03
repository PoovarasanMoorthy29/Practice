package src;

public class ArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int k = 0;
        while (k< nums.length) {
            int[] num = nums.clone();
            rotate(0, num.length - 1, num);
            rotate(0, k - 1, num);
            rotate(k, num.length - 1, num);
            if (isSorted(num)) {
                return true;
            }
            k++;
        }
        return false;
    }

    //helper method
    public static int[] rotate(int left, int right, int[] arr) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return arr;
    }

    // helper method
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr={3,4,5,1,2};
        ArrayIsSortedAndRotated obj=new ArrayIsSortedAndRotated();
        System.out.println(obj.check(arr));
    }

}
