public class MinimumCapacityBox {
    public int minimumIndex(int[] capacity, int itemSize) {
        // Find the itemsize capacity is exist
        int resultIndex=0;
        for(int index=0;index<capacity.length;index++){
            if(capacity[index]==itemSize){
                return index;
            }
        }
        //find the maximum value
        int maxIdx=0;
        for(int index=1;index<capacity.length;index++){
            if(capacity[maxIdx]<capacity[index]){
                maxIdx=index;
            }
        }
        //check if particular capacity is exist?
        if(capacity[maxIdx]<itemSize){
            return -1;
        }
        //find the capacity index
        for(int index=0;index<capacity.length;index++){
            if(capacity[index]>itemSize && capacity[index]<capacity[maxIdx]){
                maxIdx=index;
            }
        }
        return maxIdx;

    }

    static void main() {
        int[]arr={1,5,3,7};
        int itemSize=3;
        MinimumCapacityBox obj=new MinimumCapacityBox();
        System.out.println(obj.minimumIndex(arr,itemSize));
    }
}
