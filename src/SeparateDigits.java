package src;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SeparateDigits {
    public int[] separateDigits(int[] nums) {
        List<Character> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            String cur = "" + nums[index];
            for (int i = 0; i < cur.length(); i++) {
                list.add(cur.charAt(i));
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i) - '0';

        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        src.SeparateDigits s = new src.SeparateDigits();
        System.out.println(Arrays.toString(s.separateDigits(nums)));
    }
}

