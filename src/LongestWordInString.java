package src;

public class LongestWordInString {

    private String findLongestWord(String str) {
        int maxStart = 0;
        int maxEnd = 0;
        int curStart = 0;
        int curEnd = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                if ((maxEnd - maxStart) < (curEnd - curStart)) {
                    maxStart = curStart;
                    maxEnd = curEnd;
                }
                curStart = i + 1;
            } else {
                curEnd = i;
            }
        }
        if ((maxEnd - maxStart) < (curEnd - curStart)) {
            maxStart = curStart;
            maxEnd = curEnd;
        }
        StringBuilder result = new StringBuilder();
        for (int i = maxStart; i <= maxEnd; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();

    }

    public static void main(String[] args) {
        LongestWordInString obj = new LongestWordInString();
        String str = "i love tennis";
        System.out.println(obj.findLongestWord(str));
    }
}
