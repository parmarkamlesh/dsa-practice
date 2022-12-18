class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //todo 
        int m = temperatures.length;
        int[] ans = new int[m];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}