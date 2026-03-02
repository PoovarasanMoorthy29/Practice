package BinarySearch;
public class PeakIndexMountainArr {
    public int peakIndexInMountainArray(int[] arr) {

        /* Brute force & Time complexity : O(N).
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&& arr[i] >arr[i+1]){
                return i;
            }
        }
        return -1;
        */
        
        //Optimized solution & Time complexity : O(log N).
        // Use Binary Search.
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PeakIndexMountainArr obj=new PeakIndexMountainArr();
        int[] arr={0,10,5,2};
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}

