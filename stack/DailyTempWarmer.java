// neetcode 150 medium
// technique: stack (monotonic decreasing stack)


package stack;

import java.util.Stack;

public class DailyTempWarmer {
    public int[] dailyTemperatures(int[] temperatures) {

        int [] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();             // pair: [temp, index]

        for (int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i];

            while (!stack.isEmpty() && currentTemp > stack.peek()[0]) {
                int[] preDay = stack.pop();
                int preIndex = preDay[1];               // pair: [temp, index]
                result[preIndex] = i - preIndex;        // i = currentIndex
            }
            stack.push(new int[] {currentTemp, i});
        }

        return result;
        }
}

