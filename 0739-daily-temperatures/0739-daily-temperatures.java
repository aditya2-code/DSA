import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        
        // Stack to store indices of the days
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // While the current temperature is warmer than the temperature at the top index of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                // The number of days to wait is the difference between the indices
                answer[prevIndex] = i - prevIndex;
            }
            // Push the current day's index onto the stack
            stack.push(i);
        }
        
        return answer;
    }
}