public class EggDrop {
    public int twoEggDrop(int n) {
        float product=1.0f;
        for(int index=1;index<=n;index++){
            product=(float)(index*(index+1))/2;
            if(Math.round(product)>=n){
                return index;
            }
            product=1.0f;

        }
        return 0;

    }
    public static void main(String [] args){
        int n=100;
        EggDrop obj=new EggDrop();
        System.out.println(obj.twoEggDrop(n));
    }
}
