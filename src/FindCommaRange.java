public class FindCommaRange {
    public int countCommas(int n) {
        int numLength = (String.valueOf(n)).length();
        if (numLength < 4) {
            return 0;
        }
        int commaCount = (numLength - 1) / 3;
        int totalCount = 0;
        for (int index = 1000; index <= n; index++) {
            totalCount += commaCount;
        }
        return totalCount;

    }

    static void main() {
        int n=1002;
        FindCommaRange obj=new FindCommaRange();
        System.out.println(obj.countCommas(n));

    }
}
