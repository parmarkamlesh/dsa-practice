class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev = 0, prevprev = 0, current = 0;
        for(int i = 2; i <= cost.length; i++) {
            current = Math.min(cost[i-1]+prev, cost[i-2]+prevprev);
            prevprev = prev;
            prev = current;
        }
        return current;  
    }
}