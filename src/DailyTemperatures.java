import java.util.*;
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int index = 0; index < temperatures.length; index++) {
            while (!stack.isEmpty() && temperatures[index] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = index - prevIndex;
            }
            stack.push(index);
        }
        return result;
    }

    public static void main(String[] args) {
        DailyTemperatures obj=new DailyTemperatures();
        int[] arr={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(obj.dailyTemperatures(arr)));

    }
}
