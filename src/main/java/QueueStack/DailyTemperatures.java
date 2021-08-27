package QueueStack;

import java.util.Stack;

/**Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i]
is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which
 this is possible, keep answer[i] == 0 instead.

Example 1:
        Input: temperatures = [73,74,75,71,69,72,76,73]
        Output: [1,1,4,2,1,1,0,0]
        Example 2:

        Input: temperatures = [30,40,50,60]
        Output: [1,1,1,0]
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length - 1; i++){
            int count = 0;
            for (int j = i + 1; j < temperatures.length; j++){
                count++;
                if (temperatures[i] < temperatures[j]){
                    days[i] = count;
                    break;
                }
            }
            if (i == temperatures.length - 1) days[i] = 0;
        }
        return days;
    }
}
