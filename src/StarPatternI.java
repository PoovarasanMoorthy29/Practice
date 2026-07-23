package src;

public class StarPatternI {
    public static void main(String[] args) {
        int n = 4;
        int temp = n;
        for (int i = 0; i <= n; i++) {
            int val = temp;
            int incr = 0;
            for (int j = 0; j < i; j++) {
                System.out.print(val + ((j > 0) ? incr : 0) + " ");
                incr += 2;

            }
            temp += i;
            System.out.println();
        }
    }
}
